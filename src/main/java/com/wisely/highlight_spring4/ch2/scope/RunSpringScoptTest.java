package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunSpringScoptTest {

	/**
	 * 可以看到，sington的scope范围，只创建一个实例；prototype类型，每次调用都创建一个新的实例
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = context.getBean(DemoSingletonService.class);

		DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

		System.out.println(String.format("singleton1[%s] 和 singleton2[%s] 是否相等:%s", s1, s2, (s1 == s2)));
		System.out.println(String.format("prototype1[%s] 和 prototype2[%s]  是否相等:%s", p1, p2, (p1 == p2)));
	}

}
