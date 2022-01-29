package com.sourav.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@Aspect
public class LogBeforeAdvice {
	private static final Logger logger = LoggerFactory.getLogger(LogBeforeAdvice.class);
	
	@Before("execution(* com.sourav.controller.AplicationController*.*(..))")
	public void logBefore(JoinPoint jp) {
		
		logger.debug("..I WILL EXECUTE BEFORE:" +jp.getSignature() + "..");
	}
}
