package com.java.baisc;

import java.util.HashMap;

public class MainTest {
	
	public static void main(String[] args) {
		System.out.println(new ObjectTest().hashCode());
		System.out.println(new ObjectTest().hashCode());
		ObjectTest a = new ObjectTest();
		ObjectTest b = new ObjectTest();
		System.out.println(b.hashCode());
		System.out.println(b.hashCode());
		
		HashMap<ObjectTest, String> map = new HashMap<ObjectTest, String>();
		map.put(a, "1");
		map.put(b, "2");
		System.out.println(map.size());
	}

}
