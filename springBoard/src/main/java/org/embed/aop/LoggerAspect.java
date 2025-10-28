package org.embed.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class LoggerAspect {

	@Around("execution(* org.embed..controller.*Controller.*(..)) or execution(* org.embed..service.*Impl.*(..)) or execution(* org.embed..mapper.*Mapper.*(..))")
	public Object logPrint(ProceedingJoinPoint joinPoint) throws Throwable {
      
		String type = "";
		String name = joinPoint.getSignature().getDeclaringTypeName();
		
		if (name.indexOf("Controller") > -1) {
			type = "Controller \t : ";
		} else if (name.indexOf("Service") > -1) {
			type = "ServiceImpl \t : ";
		} else if (name.indexOf("Mapper") > -1) {
			type = "Mapper \t\t : ";
		}
		
		log.info("=========================>>>>>>>>>>>");
		log.info(type + name + "." + joinPoint.getSignature().getName() + "()");
      
		return joinPoint.proceed();
	}
}
