package com.macy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidOrderIdException extends RuntimeException {

	private String message;

	public InvalidOrderIdException() {
		super();
		this.message = "";
	}

	public InvalidOrderIdException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "Invalid Order Id : "+message;
	}
}
