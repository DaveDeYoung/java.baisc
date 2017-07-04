package com.java.socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class FileHandlerThread extends Thread{
	
	Socket socket ;
	
	public FileHandlerThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try {
			InputStream in = socket.getInputStream();
			FileOutputStream out = new FileOutputStream("D:\\1.zip");
			byte[] b = new byte[512];
			while((in.read(b))!=-1){
				System.out.println(b);
				out.write(b);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
