package com.springboot.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 面向切面的Aop日志记录
 * 
 * @author 017220
 * @date 2018.5.23
 */
@Slf4j
@Aspect
@Component
public class AOPServiceConfig {
	
	@Pointcut("execution(* com.springboot.demo.service.impl.*ServiceImpl.*(..))")
	public void todo() {
		
	}
	
	@Around("todo()")
	public Object log(ProceedingJoinPoint point) throws Throwable {
		log.info("Start log:" + point.getSignature().getName());
		Object object = point.proceed();
		log.info("End log:" + point.getSignature().getName());
		return object;
	}
}
