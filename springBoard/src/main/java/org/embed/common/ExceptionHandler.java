package org.embed.common;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ExceptionHandler {
	
//	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
//	public ModelAndView defaultExceptionHandler (HttpServletRequest req, Exception e) {
//		
//		ModelAndView mv = new ModelAndView("/error/error_default");
//		mv.addObject("exception", e);
//		
//		log.error("defaultExceptionHandler", e);
//		
//		return mv;
//	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ModelAndView defaultExceptionHandler(HttpServletRequest req, Exception e) {
		
		log.error("defaultExceptionHandler - URL: {}", req.getRequestURL(), e);
		
		ModelAndView mv = new ModelAndView("error/error_default");
		
		// 예외 메시지
		mv.addObject("message", e.getMessage());
		
		// 스택 트레이스를 List<String>으로 변환
		List<String> stackTraceList = Arrays.stream(e.getStackTrace())
				.map(StackTraceElement::toString)
				.collect(Collectors.toList());
		mv.addObject("stackTraceList", stackTraceList);
		
		return mv;
	}

}
