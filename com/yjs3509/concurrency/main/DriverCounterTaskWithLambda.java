package com.yjs3509.concurrency.main;

import com.yjs3509.concurrency.domain.MyInterface;

public class DriverCounterTaskWithLambda {
	

	// !
	static public void main(String[] args) {

		int counter = 10;

		MyInterface myInterface = (c) -> {
			System.out.println(c);
		};

//		MyInterface myInterface = new MyInterface() {
//			@Override
//			public void run(int i) {
//				System.out.println(i);
//			}
//		};

		Runnable counterTask = () -> {
			int i = counter * 10;
			while (i-- != 0) {
				myInterface.run(i);
			}
		};

		// !!
//		while(counter-- != 0) {
//			System.out.println(counter);
//		}

		new Thread(counterTask).start();
		System.out.println("Main Thread is running ");
	}
}
