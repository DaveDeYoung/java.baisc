package com.java.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class DownloadFileServer {
	
	public void start() throws IOException {
		ServerSocket serverSocket = new ServerSocket(60000);
		while(true){
			Socket socket = serverSocket.accept();
			FileHandlerThread h = new FileHandlerThread(socket);
			h.start();
		}
	}
	
	public static void main(String[] args) throws IOException {
		DownloadFileServer downloadFileServer = new DownloadFileServer();
		downloadFileServer.start();
	}

}
