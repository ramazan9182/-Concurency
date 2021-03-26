package com.yjs3509.concurrency.callable.main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.yjs3509.concurrency.callable.domain.TaskB;

public class Driver {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newCachedThreadPool(); // DO NOT USE IN PRODUCTION 
		Future<Integer> taskResult = service.submit(new TaskB());
		
		try {
			System.out.println("Result :" + taskResult.get());
			
			
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		
		service.shutdown();
	}
}
