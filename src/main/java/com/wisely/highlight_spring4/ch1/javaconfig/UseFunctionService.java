package com.wisely.highlight_spring4.ch1.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class UseFunctionService {

	@Autowired
	FunctionService functionService;

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
}
