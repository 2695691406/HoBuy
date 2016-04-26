package hobuy.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hobuy.service.IndexService;

@Controller
public class IndexController {
	@Value("#{indexService}")
	private IndexService indexService;

	@RequestMapping(value = "/index.do")
	public String showIndex(HttpServletRequest request) {
		indexService.showIndex(request);
		return "jsp/index/index.jsp";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		request.getSession().setAttribute("last_time", System.currentTimeMillis());
		return "jsp/login.jsp";
	}

	@RequestMapping(value = "/regist.do", method = RequestMethod.GET)
	public String regist(HttpServletRequest request) {
		return "jsp/registType.jsp";
	}

	@RequestMapping(value = "/checkphone.do")
	public void checkPhone(String phone, HttpServletRequest request, HttpServletResponse response) {
		System.out.println(phone);
		Boolean isregist = indexService.checkPhone(phone, request);
		try {
			if (isregist) {
				System.out.println("0");
				response.getWriter().write("0");
			} else {
				System.out.println("1");
				response.getWriter().write("1");
				request.getSession().setAttribute("checkPhone", phone);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/checkphoneforpwd.do")
	public void checkPhoneForPwd(String phone, HttpServletRequest request, HttpServletResponse response) {
		System.out.println(phone);
		Boolean isregist = indexService.checkPhone(phone, request);
		try {
			if (isregist) {
				response.getWriter().write("0");
				System.out.println(phone + "checkphone");
				request.getSession().setAttribute("checkPhone", phone);
			} else {
				System.out.println("1");
				response.getWriter().write("1");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/phonemessage.do")
	public void phoneMessage(String phone, HttpServletRequest request, HttpServletResponse response) {
		String checkphone = (String) request.getSession().getAttribute("checkPhone");
		System.out.println(checkphone);
		System.out.println(phone);
		if (checkphone != null && checkphone.equals(phone)) {
			Boolean sendok = indexService.phoneMessage(phone, request);
			try {
				if (sendok) {
					response.getWriter().write("1");
				} else {
					response.getWriter().write("0");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			return;

		}
	}

}
