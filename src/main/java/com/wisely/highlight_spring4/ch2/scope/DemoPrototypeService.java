package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 声明scope为Prototype
 * @author lerry
 * created on 2016年7月21日
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
