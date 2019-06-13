package com.spring.core;

public class Greetings {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
//create init and destroy method
	public void init() {
		System.out.println("initialization");
	}
	public void destroy() {
		System.out.println("Destroy bean");
	}
}
