package com.java.proxy;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

import com.java.proxy.busines.RealSubject;
import com.java.proxy.busines.impl.Subject;
import com.java.proxy.invocation.ProxyHandler;

import sun.misc.ProxyGenerator;

public class ProxyTest {
	
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), 
					new Class[]{Subject.class}, new ProxyHandler(realSubject));
		subject.doSomething();
		createProxyClassFile();
	}
	
	public static void createProxyClassFile() {
		String name = "ProxySubject";
		byte[] data = ProxyGenerator.generateProxyClass(name, new Class[]{Subject.class});
		try {
			FileOutputStream out = new FileOutputStream("D:\\"+name+".class");
			out.write(data);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
