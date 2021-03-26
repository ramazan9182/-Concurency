package com.yjs3509.concurrency.executors.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import com.yjs3509.concurrency.executors.domain.CounterTask;

public class DriverFixedThreadPool {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		ExecutorService service = Executors.newFixedThreadPool(1);

		for (int i = 0; i < 10; i++) {
			service.execute(new CounterTask(10));
		}

		
		long end = System.currentTimeMillis();

//		System.out.println(end - start);

		service.shutdown();

	}
}
