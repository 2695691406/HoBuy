package hobuy.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hobuy.domain.Soler;
import hobuy.service.SolerService;

@Controller
public class SolerController {
	@Value("#{solerService}")
	private SolerService solerService;

	/**
	 * 商家登陆
	 * 
	 * @return
	 */
	@RequestMapping(value = "/loginsoler.do", method = RequestMethod.POST)
	public String login(Soler soler, HttpServletRequest request, HttpServletResponse response) {
		if (request.getSession().getAttribute("last_time") == null) {
			return "redirect:login.do";
		} else {
			Long last_time = (Long) request.getSession().getAttribute("last_time");
			if (System.currentTimeMillis() - last_time < 1000) {
				System.out.println("你想做什么");
				request.setAttribute("msg", "what you want to do!!!");
				return "jsp/error.jsp";
			} else {
				if (solerService.checkLoginData(soler, request)) {
					request.getSession().removeAttribute("last_time");
					return "redirect:solercenter/center.do";
				} else {
					request.getSession().setAttribute("last_time", System.currentTimeMillis());
				}
			}

		}
		return "jsp/login.jsp";
	}

	/**
	 * get请求登录页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/loginsoler.do", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		request.getSession().setAttribute("last_time", System.currentTimeMillis());
		return "jsp/login.jsp";
	}

	/**
	 * 商家注销登陆
	 * 
	 * @return
	 */
	@RequestMapping(value = "/logoffsoler.do", method = RequestMethod.GET)
	public String logoff(HttpServletRequest request) {
		request.getSession().removeAttribute("soler");
		return "redirect:login.do";
	}

	/**
	 * 商家注册
	 * 
	 * @return
	 */
	@RequestMapping(value = "/registsoler.do", method = RequestMethod.POST)
	public String regist(Integer unid, Soler soler, HttpServletRequest request) {
		if (solerService.checkRegistData(unid, soler, request)) {
			return "redirect:solercenter/center.do";
		}
		return "jsp/registSoler.jsp";
	}

	/**
	 * get获取注册页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/registsoler.do", method = RequestMethod.GET)
	public String registGet(HttpServletRequest request) {
		solerService.registGet(request);
		return "jsp/registSoler.jsp";
	}

	/**
	 * 忘记密码
	 * 
	 * @param request
	 * @return
	 */

	@RequestMapping(value = "/forgetsolerpwd.do", method = RequestMethod.GET)
	public String forgetSolerPwd(HttpServletRequest request) {
		request.getSession().setAttribute("token", UUID.randomUUID().toString());
		return "jsp/ForgetSolerPwd.jsp";
	}

	@RequestMapping(value = "/forgetsolerpwd.do", method = RequestMethod.POST)
	public String forgetUserPwdPost(String checknumber, String phone, String pwd, HttpServletRequest request) {
		if (request.getSession().getAttribute(phone) != null) {
			String updateCode = (String) request.getSession().getAttribute(phone);
			if (updateCode.equals(checknumber)) {
				solerService.forgetUserPwdPost(phone, pwd, request);
				return "jsp/UpdatePwdSuccess.jsp";
			}
		}
		return "jsp/ForgetSolerPwd.jsp";
	}
}
