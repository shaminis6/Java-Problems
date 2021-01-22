package com.practice.thread;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	private final BlockingQueue sharedQue;
		

	public Producer(BlockingQueue sharedQue) {
		super();
		this.sharedQue = sharedQue;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
		try
		{
			System.out.println("Produced : "+i);
			sharedQue.put(i);
			
		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	}	

}
