package com.ledis.exception;

public class InternalCompilerException extends RuntimeException {

	private String msg;

	private Exception cause;

	public InternalCompilerException(String msg, Exception cause){
		this.msg = msg;
		this.cause = cause;
	}
}
