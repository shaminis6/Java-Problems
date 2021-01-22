package com.practice.thread;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	
	private final BlockingQueue sharedQue;
	

	public Consumer(BlockingQueue sharedQue) {
		super();
		this.sharedQue = sharedQue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try
			{
				System.out.println("Consumed : "+sharedQue.take());
				
			}
			catch(InterruptedException e)
			{
				System.out.println("exception");
			}
		}

	}

}
