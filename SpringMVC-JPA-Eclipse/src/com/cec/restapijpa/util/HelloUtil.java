package com.cec.restapijpa.util;

public class HelloUtil {
	
	private String message;
	
	public HelloUtil(String message){
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String sayHello(){
		return this.message;
	}

}
