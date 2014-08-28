package com.bilginc.pattern1;

public class Fault {

	private String message;
	private Exception exception;

	public Fault() {
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}

	@Override
	public String toString() {
		return "Fault [message=" + message + ", exception=" + exception + "]";
	}

}
