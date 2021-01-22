package com.practice.Threads;

public class ThreadExample1 {
	
	public static class MyThread extends Thread
	{
		public void run()
		{
			System.out.println("Thread is running");
			System.out.println("Thread is stopped");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		thread.start();
	}

}
