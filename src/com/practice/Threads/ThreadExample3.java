package com.practice.Threads;

public class ThreadExample3 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new Runnable()
		{
			public void run()
			{
				System.out.println("Runnable thread started");
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
