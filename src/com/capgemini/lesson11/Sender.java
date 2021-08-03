package com.capgemini.lesson11;

public class Sender<T> {
	
	private T message;
	public void setMessage(T message) {
		this.message = message;
	}
	public T getMessage() {
		return message;
	}
	public void sendMessage() {
		System.out.println("Message Type:"+ getMessage().getClass());
		System.out.println("Contents are:"+getMessage());
	}
	
}
