package com.practice.restapitask.exception;

@SuppressWarnings("serial")
public class InvalidDetailsException extends RuntimeException {

	public InvalidDetailsException(String message) {
		super(message);
	}

}
