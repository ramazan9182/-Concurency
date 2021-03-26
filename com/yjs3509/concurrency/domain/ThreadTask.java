package com.yjs3509.concurrency.domain;

public class ThreadTask extends Thread{

	@Override
	public void run() {
		System.out.println("Thread Task is running");
	}
}
