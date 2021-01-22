package com.practice.Threads;

public class ThreadExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = ()->{
			System.out.println("the current thread name is "+Thread.currentThread().getName());
			
			// to make thread sleep
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Thread is finished");
		};
		
		Thread t1 = new Thread(r1,"myThread1");
		//stop thread
		t1.setDaemon(true);
		t1.start();
		
		try
		{
			// use to run even if setDaemon is true
			t1.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		Thread t2 = new Thread(r1,"myThread2");
		// stops thread
		t2.setDaemon(true);
		t2.start();

	}

}
