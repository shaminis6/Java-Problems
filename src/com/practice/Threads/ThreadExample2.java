package com.practice.Threads;

public class ThreadExample2 {
	
	public static class MyRunnable implements Runnable
	{
		public void run()
		{
			System.out.println("Thread is running");
			System.out.println("Thread stopped");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyRunnable());
		t1.start();

	}

}
