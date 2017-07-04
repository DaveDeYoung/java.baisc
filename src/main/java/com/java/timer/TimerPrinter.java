package com.java.timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TimerPrinter implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		System.out.println("at the tone, time is :"+new Date());
	}
	
}
