package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

	@Action(name = "添加")
	public void add() {
	};
}
