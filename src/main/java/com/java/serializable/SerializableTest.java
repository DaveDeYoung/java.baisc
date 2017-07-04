package com.java.serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableTest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8128359412266548867L;
	
	private String name;
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		SerializableTest serializableTest = new SerializableTest();
		serializableTest.setName("zhangsan");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("E:\\11.ser"));
		objectOutputStream.writeObject(serializableTest);
		objectOutputStream.close();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
