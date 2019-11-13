package net.fsd.comm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoginInterceptor implements HandlerInterceptor {
	private static Logger log = LoggerFactory.getLogger(LoginInterceptor.class);

	@Autowired
	TokenService tokenService;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
		// http://localhost:8769/auth/login
		System.out.println("getRequestURL:" + request.getRequestURL().toString());
		System.out.println("getContextPath:" + request.getContextPath());
		System.out.println("getServletPath:" + request.getServletPath());
		Object accessToken = request.getParameter("token");
		String hToken = request.getHeader("Authorization");
		if (accessToken == null) {
			return false;
		}
		if (tokenService.allowaccess()) {
			return true;
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
			ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
			Object o, Exception e) throws Exception {

	}
}