package com.wisely.highlight_spring4.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
/**
 * 日志切面
 * @author lerry
 * created on 2016年7月21日
 */
@Aspect
@Component
public class LogAspect {

	@Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")
	public void annotationPointCut() {

	}

	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println(String.format("注解式拦截 %s", action.name()));
	}

	
	
	@Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinpoint) {
		MethodSignature signature = (MethodSignature) joinpoint.getSignature();
		Method method = signature.getMethod();
		System.out.println(String.format("方法规则拦截 %s", method.getName()));
	}
}
