package com.java.inner;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock1 {
	
	public void start(int interval,final boolean beep) {
		ActionListener actionListener = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Date now = new Date();
				System.out.println("At the tone,the time is :"+now);
				if(beep) Toolkit.getDefaultToolkit().beep();
			}
		};
		
		Timer timer = new Timer(interval, actionListener);
		timer.start();
	}

}
