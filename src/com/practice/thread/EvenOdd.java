package com.practice.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOdd {
	
	static AtomicInteger atomicnum = new AtomicInteger(1);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r1 = ()->{
			while(atomicnum.get()<10)
			{
				synchronized(atomicnum)
				{
					if(atomicnum.get()%2==0 && "Even".equals(Thread.currentThread().getName()))
						System.out.println("Even : "+atomicnum.getAndIncrement());
					else
						System.out.println("Odd : "+atomicnum.getAndIncrement());
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.setName("Even");
		Thread t2 = new Thread(r1);
		t2.setName("Odd");
		
		t1.start();
		t2.start();
		

	}

}
