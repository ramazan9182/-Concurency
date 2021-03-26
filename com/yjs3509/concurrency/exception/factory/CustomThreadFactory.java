package com.yjs3509.concurrency.exception.factory;

import java.util.concurrent.ThreadFactory;

import com.yjs3509.concurrency.exception.handler.CustomThreadExceptionHandler;

public class CustomThreadFactory implements ThreadFactory{
	
	@Override
	public Thread newThread(Runnable r) {
		Thread thread = new Thread(r);
		thread.setUncaughtExceptionHandler(new CustomThreadExceptionHandler());
		System.out.println("new thread generated");
		return thread;
	}

}
