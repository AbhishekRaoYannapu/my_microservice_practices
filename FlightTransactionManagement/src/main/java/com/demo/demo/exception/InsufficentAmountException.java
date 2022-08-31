package com.demo.demo.exception;

public class InsufficentAmountException extends RuntimeException{

	public InsufficentAmountException(String message) {
		super(message);
	}
}
