package com.java.factory;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Properties;

import javax.annotation.Resource;

public class BeanFactory {
	
	private static Properties pro = new Properties();
	
	private static BeanFactory beanFactory = new BeanFactory();
	
	private BeanFactory(){}
	
	static{
		try {
			pro.load(beanFactory.getClass().getClassLoader().getResourceAsStream("app"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static BeanFactory getBeanFactory(){
		return beanFactory;
	}
	
	public Object getBean(String name){
		Object object = null;
		try {
			String classInfo = pro.getProperty(name);
			Class c = Class.forName(classInfo);
			object = c.newInstance();
			Field[] fs = object.getClass().getDeclaredFields();
			for (Field field : fs) {
				Annotation[] annos = field.getAnnotations();
				for (Annotation annotation : annos) {
					if(annotation instanceof Resource){
						Object object2 = getBeanFactory().getBean(field.getName());
						String str = field.getName();
						str = str.replace(str.substring(0, 1), str.substring(0, 1).toUpperCase());
						object.getClass().getMethod("set"+str, object2.getClass().getInterfaces()).invoke(object, object2);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}
	
}
