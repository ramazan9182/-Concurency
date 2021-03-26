package com.yjs3509.concurrency.priority.domain;

public abstract class Task implements Runnable{
	
	private static int idCounter = 0;
	private final int id = idCounter++;
	protected int count;
	private int taskPriority;
	
	
	public void setTaskPriority(int taskPriority) {
		this.taskPriority = taskPriority;
		Thread.currentThread().setPriority(taskPriority);
	}
	
	public int getTaskPriority() {
		return taskPriority;
	}
	
	
	public int getId() {
		return id;
	}
	
}
