package com.sourav.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAfterAdvice {
	private static final Logger logger = LoggerFactory.getLogger(LogAfterAdvice.class);
	@Pointcut("execution(* com.sourav.controller.AplicationController*.*(..))")
	public void pk() {}

	@After("pk()")
	public void mylogAfter(JoinPoint jp) {
		logger.debug("..I WILL EXECUTE AFTER:" +jp.getSignature() + "..");
	}
}
