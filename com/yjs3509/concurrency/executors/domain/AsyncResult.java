package com.yjs3509.concurrency.executors.domain;

import java.util.concurrent.TimeUnit;

public class AsyncResult<T> {
	
	private T data;
	private boolean isDone;
	
	public AsyncResult() {
		
	}
	
	public void setData(T data) {
		System.out.println("Data " + data);
		this.data = data;
		isDone = true;
	}
	
	public T getData() {
		
		while(!isDone) {
			System.out.println("Waiting...");
//			try {
//				TimeUnit.SECONDS.sleep(1);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			continue;
		}
			
		
		return data;
	}

}
