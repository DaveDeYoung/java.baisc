package com.java.inner;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Timer;

public class TalkingClock {
	
	public void start(int interval,final boolean beep) {
		class TimerPrinter implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				Date now = new Date();
				System.out.println("At the tone,the time is :"+now);
				if(beep) Toolkit.getDefaultToolkit().beep();
			}
			
		}
		ActionListener actionListener = new TimerPrinter();
		Timer timer = new Timer(interval, actionListener);
		timer.start();
	}
	
	public static void main(String[] args) {
		TalkingClock clock = new TalkingClock();
		clock.start(2000, true);
	}

}
