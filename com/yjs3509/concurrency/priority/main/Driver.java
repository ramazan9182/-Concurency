package com.yjs3509.concurrency.priority.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yjs3509.concurrency.priority.domain.Task;
import com.yjs3509.concurrency.priority.domain.TaskE;
import com.yjs3509.concurrency.priority.domain.TaskF;
import com.yjs3509.concurrency.priority.factory.CustomPriorityThreadFactory;

public class Driver {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5, new CustomPriorityThreadFactory());
		for (int i = 0; i < 5; i++) {
			System.out.println("Iteration # " + i);
			service.submit((Task) new TaskE(20));
			service.submit((Task) new TaskF(40));
		}

		service.shutdown();

	}
}
