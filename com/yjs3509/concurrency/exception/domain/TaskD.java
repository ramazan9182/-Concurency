package com.yjs3509.concurrency.exception.domain;

import java.io.IOException;

public class TaskD implements Runnable {

	@Override
	public void run() {
		// throw new RuntimeException();
		int result = 34 / 0;
		
	}

}
