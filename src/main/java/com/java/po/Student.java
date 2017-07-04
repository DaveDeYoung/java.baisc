package com.java.po;

public class Student {
	
	
	private int code;//身份证号
	
	private String name;
	
	private String phone;
	
	@Override
	public int hashCode() {
		return Integer.valueOf(this.code);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)){
			return false;
		}
		Student t = (Student) obj;
		if(this.name == t.name && this.phone == t.phone){
			return true;
		}
		return false;
	}


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
