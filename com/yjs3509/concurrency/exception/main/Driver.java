package com.yjs3509.concurrency.exception.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.yjs3509.concurrency.exception.domain.TaskC;
import com.yjs3509.concurrency.exception.domain.TaskD;

public class Driver {

	
	public static void main(String[] args) {
		
		try {
			ExecutorService service = Executors.newFixedThreadPool(2);
			Future<Integer> result = service.submit(new TaskC());
//			System.out.println(result.get());
			
			Future<?> resultRunnable  = service.submit(new TaskD());
			// Where
//			System.out.println(resultRunnable.get());
			
			service.shutdown();
		}catch (Exception e) {
			System.out.println("Caught !!!");
			System.out.println(e.getClass().getSimpleName());
			System.out.println(e.getCause());
		}
		
		
		
	}
}
