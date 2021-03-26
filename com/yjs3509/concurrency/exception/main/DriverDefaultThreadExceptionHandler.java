package com.yjs3509.concurrency.exception.main;

import com.yjs3509.concurrency.exception.handler.CustomThreadExceptionHandler;

public class DriverDefaultThreadExceptionHandler {
	
	public static void main(String[] args) {
		
		Thread.setDefaultUncaughtExceptionHandler(new CustomThreadExceptionHandler());
		
	}
}
