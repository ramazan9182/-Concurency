package com.yjs3509.concurrency.domain;

public class CounterTask implements Runnable{
	
	private static int idCounter = 0;
	private final int id = idCounter++;
	private int counter = 10;
	
	
	@Override
	public void run() {
		while(counter-- != 0) {
			System.out.println("Counter Task - " + id + "  -- " + counter);
			Thread.yield(); // task scheduler hint
		}
	}

}
