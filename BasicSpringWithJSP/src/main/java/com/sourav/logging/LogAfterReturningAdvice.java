package com.sourav.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAfterReturningAdvice {
	private static final Logger logger = LoggerFactory.getLogger(LogAfterReturningAdvice.class);
	@AfterReturning(pointcut = "execution(* com.sourav.controller.AplicationController*.*(..))",
			returning = "result")
	public void logAfterReturning(JoinPoint jp,Object result) {

		logger.debug("\nExecution status of AplicationController method is: " + result);
		logger.debug("..I WILL EXECUTE After Returning:" +jp.getSignature() + "..");

	}
}
