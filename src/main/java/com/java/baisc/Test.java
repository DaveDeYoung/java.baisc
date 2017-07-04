package com.java.baisc;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
	
	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string);
		}
		int a = 010;
		System.out.println(a);
		System.out.println("hello first javac");
		char c = '\u2122';
		System.out.println(c);
		BigInteger aaa = new BigInteger("100000000000000000000000000000");
		System.out.println(aaa.multiply(aaa));
		int[] arr = {1,2,3};
		int[] arr1 = Arrays.copyOf(arr, arr.length*2);
		System.out.println(arr1.length);
	}
	
	@Override
	public int hashCode() {
		return 111;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}

}
