package com.java.baisc;

import java.util.HashMap;
import java.util.Map;

public class HashTest {
	
	public static void main(String[] args) {
		Map<Test, Test> m = new HashMap<Test, Test>();
		m.put(new Test(), new Test());
		m.put(new Test(), new Test());
		System.out.println(m.size());
	}

}
