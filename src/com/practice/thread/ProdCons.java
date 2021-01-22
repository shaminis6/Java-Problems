package com.practice.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProdCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlockingQueue que = new LinkedBlockingQueue();
		Thread prod = new Thread(new Producer(que));
		Thread cons = new Thread(new Consumer(que));
		
		Thread t1 = new Thread(()->System.out.println("Thread created"));
		t1.start();
		
		Thread t2 = new Thread(()->System.out.println("Thread 2 created"));
		t2.start();
		prod.start();
		cons.start();

	}

}
