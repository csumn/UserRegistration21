package com.bridgelabz;

@SuppressWarnings("serial")
public class InvalidUserException extends Exception {

	ExceptionType type;

	enum ExceptionType {
		ENTERED_INVALID, ENTERED_NULL
	}
	public InvalidUserException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}
