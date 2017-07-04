package com.java.factory;

import javax.annotation.Resource;

public class Test {
	
	@Resource
	InterfaceTest interfaceTest;
	
	public static void main(String[] args) {
		Test test =	(Test) BeanFactory.getBeanFactory().getBean("test");
		System.out.println(test.interfaceTest.getName());
	}
	
	public void setInterfaceTest(InterfaceTest interfaceTest) {
		this.interfaceTest = interfaceTest;
	}

}
