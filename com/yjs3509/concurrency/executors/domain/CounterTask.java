package com.yjs3509.concurrency.executors.domain;

public class CounterTask implements Runnable {

	private static int idCounter = 0;
	private final int id = idCounter++;
	private int counter;
	
	public CounterTask(int initialCounterValue) {
		this.counter = initialCounterValue;
	}
	
	@Override
	public void run() {
		while(--counter >= 0) {
			printState(counter);
		}
		// SIGNAL
	}

	public void printState(int currentCounterValue) {
		System.out.println(Thread.currentThread() + ", CounterTask [id=" + id + ", counter=" + currentCounterValue + "]");
	}
	
}
