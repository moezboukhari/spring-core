package com.spring.core;

public class Greetings {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void init() {
		System.out.println("init");
	}
public void destroy() {
	System.out.println("destroy");

	}

}
