package hobuy.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import hobuy.domain.User;

public class UserLoginInterceptor implements HandlerInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		User user = (User) request.getSession().getAttribute("user");
		// String ip = (String)
		// request.getServletContext().getAttribute(user.getId() + "");
		System.out.println(request.getRequestedSessionId());
		if (user == null) {
			response.sendRedirect("/HoBuy/login.do");
			return false;
		} else {
			return true;
		}
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
