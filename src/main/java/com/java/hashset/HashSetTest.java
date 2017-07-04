package com.java.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.java.po.Student;

public class HashSetTest {
	
	//hashcode 可以认为是主键  equals 数据内容  
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		Student a = new Student();
		a.setCode(200);
		a.setName("zhangsan");
		Student b = new Student();
		b.setCode(200);
		b.setName("lisi");
		set.add(a);
		set.add(b);
		System.out.println(set.size());
		
//		Map<Student, String> m = new HashMap<Student, String>();
//		Student a = new Student();
//		a.setCode("100");
//		Student b = new Student();
//		b.setCode("100");
//		m.put(a, "100");
//		m.put(b, "200");
//		System.out.println(m.size());
	}

}
