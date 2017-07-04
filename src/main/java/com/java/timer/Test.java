package com.java.timer;

import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Test {
	
	public static void main(String[] args) {
		ActionListener listener = new TimerPrinter();
		Timer timer = new Timer(10000, listener);
		timer.start();
		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
