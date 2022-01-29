package com.sourav.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAroundAdvice {
	private static final Logger logger = LoggerFactory.getLogger(LogAroundAdvice.class);
	
	@Around("execution(* com.sourav.controller.AplicationController*.*(..))")
	public Object myLogAroundAdvice(ProceedingJoinPoint jp) {
		Object obj = null;
		logger.debug("..Around WILL EXECUTE BEFORE:" +jp.getSignature() + "..");
		try {
			obj = jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.debug("..Around WILL EXECUTE AFTER:" +jp.getSignature() + "..");
		return obj;
	}
}
