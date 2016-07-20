package com.wisely.highlight_spring4.ch1.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 统计方法执行耗时
 * 
 * @author Envy6x
 *
 */
@Aspect
@Component
public class TimeAspect {

	@Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")
	public void annotationCut() {

	}

	@Around("annotationCut()")
	public Object wasteTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();
		Object output = joinPoint.proceed();
		long elapsedTime = System.currentTimeMillis() - start;
		String className = joinPoint.getTarget().getClass().getSimpleName();
		//className = className == null ? "" : className.substring(0, className.indexOf("$"));
		System.out.println(className);
		System.out.println(String.format("method [%s.%s] execution time:%sms", className, joinPoint.getSignature().getName(), elapsedTime));
		return output;
	}
}
