package com.java.socket;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.HashMap;

public class SendFile {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
	}
	
	public void send() throws Exception {
		String filename = "coms-qingdaoxihaian.zip";
		Socket socket = new Socket("115.199.141.191", 60000);
		OutputStream out = socket.getOutputStream();
		FileInputStream fileIn = new FileInputStream("C:\\Users\\caiwenyuan.HIK\\Desktop\\upload\\"+filename);
		byte[] b = new byte[512];
		while(fileIn.read(b)!=-1){
			out.write(b);
		}
		out.flush();
		out.close();
		fileIn.close();
		socket.close();
	}

}
