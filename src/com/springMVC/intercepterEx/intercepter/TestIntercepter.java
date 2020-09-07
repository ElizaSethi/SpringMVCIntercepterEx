package com.springMVC.intercepterEx.intercepter;



import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TestIntercepter extends HandlerInterceptorAdapter{
	
	private static Logger log = Logger.getLogger(TestIntercepter.class.getName());
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception{
		log.info("[preHandle][" + req + "]" + "[" + req.getMethod() + "]" + req.getRequestURI());
		req.setAttribute("preHandlerMsg", "Message produced before handling the request.");
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res, Object handler, ModelAndView mNv) throws Exception {
		log.info("[postHandle][" + req + "]");
		mNv.addObject("preHandlerMsg", req.getAttribute("preHandlerMsg"));
		mNv.addObject("afterHandling", "Message produced after handling the request");
		mNv.addObject("authorName", "Eliza Sethi");
		
	}
	
	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object handler, Exception ex) throws Exception {
		if(ex != null) {
			ex.printStackTrace();
		}
		log.info("[afterCompletion][" + req + "][exception: " + ex + "]");
		System.out.println("Executing afterCompletion()...");
		System.out.println("Request URL :: "+req.getRequestURI().toString());
		System.out.println("Pre-Handler Message :: "+req.getAttribute("preHandlerMsg"));
		System.out.println("Post-Handler Message :: "+req.getAttribute("afterHandling"));
		System.out.println("Author name :: "+req.getAttribute("authorName"));
	}

}
