package com.ledis.exception;

public class CompileException extends RuntimeException{

	private String msg;

	private String location;

	public CompileException(String msg, String location){
		this.msg = msg;
		this.location = location;
	}
}
