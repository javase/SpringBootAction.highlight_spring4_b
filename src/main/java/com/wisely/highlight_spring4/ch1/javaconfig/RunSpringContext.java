package com.wisely.highlight_spring4.ch1.javaconfig;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunSpringContext {

	private static Logger logger = Logger.getLogger("Run");

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		logger.info(useFunctionService.sayHello("wangWang"));
	}

}
