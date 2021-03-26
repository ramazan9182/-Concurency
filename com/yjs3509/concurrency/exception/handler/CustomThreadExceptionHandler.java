package com.yjs3509.concurrency.exception.handler;

public class CustomThreadExceptionHandler implements Thread.UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("Custom Exception Handler");
		System.out.println(t.getName() + " :: "+ e.getMessage());
	}
}
