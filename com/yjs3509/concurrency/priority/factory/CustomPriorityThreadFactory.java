package com.yjs3509.concurrency.priority.factory;

import java.util.concurrent.ThreadFactory;

import com.yjs3509.concurrency.priority.domain.Task;

public class CustomPriorityThreadFactory implements ThreadFactory{
	
	@Override
	public Thread newThread(Runnable r) {
//		System.out.println(r.getClass().getSimpleName());
		Thread thread = new Thread(r);
//		thread.setPriority(Thread.MAX_PRIORITY);
		return thread;
	}

}
