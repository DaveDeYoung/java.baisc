package com.java.memory;

import java.util.ArrayList;
import java.util.List;

public class HeapTest {
	
	public static void main(String[] args) {
		threadTest();
	}
	
	public static void heapTest(){
		List<User>  a = new ArrayList<User>();
		while(true){
			User u = new User();
			a.add(u);
		}
	}
	
	public static void threadTest(){
		while(true){
			Thread thread = new Thread(){
				@Override
				public void run() {
					try {
						Thread.sleep(1000000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			thread.start();
		}
	}

}
