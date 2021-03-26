package com.yjs3509.concurrency.executors.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import com.yjs3509.concurrency.executors.domain.CounterTask;

public class DriverSingleThreadPool {
	
	
	public static void testFixedThreadConfiguration() {
		
		ExecutorService service = Executors.newFixedThreadPool(1);
		
		for (int i = 0; i < 10; i++) {
			service.execute(new CounterTask(10));
		}
		
		// TEST CASE
		
		((ThreadPoolExecutor)service).setCorePoolSize(4);
		
		for (int i = 0; i < 10; i++) {
			service.execute(new CounterTask(10));
		}
		
		
		service.shutdown();
		
	}

	public static void main(String[] args) {
		
		testFixedThreadConfiguration();

//		ExecutorService service = Executors.newSingleThreadExecutor();
//
//		for (int i = 0; i < 10; i++) {
//			service.execute(new CounterTask(10));
//		}
//		
//		service.shutdown();
	}
}
