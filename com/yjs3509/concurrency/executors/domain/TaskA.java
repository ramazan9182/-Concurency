package com.yjs3509.concurrency.executors.domain;

import java.util.concurrent.TimeUnit;

public class TaskA implements Runnable{

	private AsyncResult<Integer> result = new AsyncResult<Integer>();
	
	@Override
	public void run(){
		System.out.println("Some calculation started ...");
		try {
			TimeUnit.SECONDS.sleep(2);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		result.setData((int)(Math.random() * 100));
		System.out.println("Calculation is done");
	}
	
	public AsyncResult<Integer> getResult() {
		return result;
	}
	
}
