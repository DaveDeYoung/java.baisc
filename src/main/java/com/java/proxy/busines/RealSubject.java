package com.java.proxy.busines;

import com.java.proxy.busines.impl.Subject;

public class RealSubject implements Subject{

	public void doSomething() {
		System.out.println("invoke success...");
	}

}
