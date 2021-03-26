package com.yjs3509.concurrency.exception.main;

import com.yjs3509.concurrency.exception.domain.TaskD;
import com.yjs3509.concurrency.exception.handler.CustomThreadExceptionHandler;

public class DriverTaskDExceptionHandler {

	public static void main(String[] args) {

//		try {

		Thread thread = new Thread(new TaskD());
		thread.setUncaughtExceptionHandler(new CustomThreadExceptionHandler());
		thread.start();
//		} catch (Exception e) {
//			System.out.println("Caught!!!");
//		}

	}
}
