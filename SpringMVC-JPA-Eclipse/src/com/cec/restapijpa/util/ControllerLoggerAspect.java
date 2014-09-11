package com.cec.restapijpa.util;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class ControllerLoggerAspect {
	
	private Logger log = Logger.getLogger(getClass());
	
	@Before("execution(* com.cec.restapijpa.web.*.*(..))")
    public void log(JoinPoint point) {
        log.info(point.getSignature().getName() + " called...");
    }	

}
