package com.yjs3509.concurrency.executors.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yjs3509.concurrency.executors.domain.CounterTask;

public class DriverExecutors {

	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 10; i++) {
			service.execute(new CounterTask(10));
		}
		
		
		service.shutdown();
		
		//service.execute(new CounterTask(20)); // Exception 
		
	}
}
