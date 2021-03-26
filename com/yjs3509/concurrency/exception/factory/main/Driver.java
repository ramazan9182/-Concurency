package com.yjs3509.concurrency.exception.factory.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yjs3509.concurrency.exception.domain.TaskD;
import com.yjs3509.concurrency.exception.factory.CustomThreadFactory;

public class Driver {

	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(2, new CustomThreadFactory());
//		service.submit(new TaskD());
		service.execute(new TaskD());
		
		service.shutdown();
		
	}
}
