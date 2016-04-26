package hobuy.controller;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hobuy.domain.User;
import hobuy.service.UserService;

@Controller
public class UserController {
	@Value("#{userService}")
	private UserService userService;

	@RequestMapping(value = "/loginuser.do", method = RequestMethod.POST)
	public String login(User user, HttpServletRequest request, HttpServletResponse response) {
		// System.out.println("post login");

		if (request.getSession().getAttribute("last_time") == null) {
			return "redirect:login.do";
		} else {
			Long last_time = (Long) request.getSession().getAttribute("last_time");
			if (System.currentTimeMillis() - last_time < 1000) {
				System.out.println("你想做什么");
				request.setAttribute("msg", "what you want to do!!!");
				return "jsp/error.jsp";
			} else {
				if (userService.checkLoginData(user, request)) {
					request.getSession().removeAttribute("last_time");
					return "redirect:index.do";
				} else {
					request.getSession().setAttribute("last_time", System.currentTimeMillis());
				}
			}

		}

		return "jsp/login.jsp";
	}

	@RequestMapping(value = "/logoffuser.do", method = RequestMethod.GET)
	public String logoff(HttpServletRequest request) {
		request.getSession().removeAttribute("user");
		return "redirect:login.do";
	}

	@RequestMapping(value = "/registuser.do", method = RequestMethod.GET)
	public String registGet(HttpServletRequest request) {
		request.getSession().setAttribute("token", UUID.randomUUID().toString());
		userService.registGet(request);
		return "jsp/registUser.jsp";
	}

	@RequestMapping(value = "/registuser.do", method = RequestMethod.POST)
	public String registPost(Integer unid, String token, String checknumber, User user, HttpServletRequest request) {
		String sessiontoken = (String) request.getSession().getAttribute("token");
		if (sessiontoken == null || !sessiontoken.equals(token)) {
			return "redirect:regist.do";
		}

		System.out.println(user);
		System.out.println(checknumber);
		if (userService.checkRegistData(unid, checknumber, user, request)) {
			request.getSession().removeAttribute("token");
			request.getSession().removeAttribute("checkPhone");
			request.getSession().removeAttribute(user.getPhone());
			return "redirect:index.do";
		}
		return "jsp/registUser.jsp";
	}

	/**
	 * 验证邮箱是否唯一，暂时弃用
	 * 
	 * @param email
	 * @param request
	 * @param response
	 */

	@RequestMapping(value = "/checkemail.do")
	public void checkEmail(String email, HttpServletRequest request, HttpServletResponse response) {
		Boolean isregist = userService.checkEmail(email, request);
		try {
			if (isregist) {
				response.getWriter().write(0);

			} else {
				response.getWriter().write(1);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 忘记密码
	 * 
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "/forgetuserpwd.do", method = RequestMethod.GET)
	public String forgetUserPwd(HttpServletRequest request) {
		return "jsp/ForgetUserPwd.jsp";
	}

	@RequestMapping(value = "/forgetuserpwd.do", method = RequestMethod.POST)
	public String forgetUserPwdPost(String checknumber, String phone, String pwd, HttpServletRequest request) {
		if (request.getSession().getAttribute(phone) != null) {
			String updateCode = (String) request.getSession().getAttribute(phone);
			if (updateCode.equals(checknumber)) {
				userService.forgetUserPwdPost(phone, pwd, request);
				return "jsp/UpdatePwdSuccess.jsp";
			}
		}
		return "jsp/ForgetUserPwd.jsp";

	}

}
