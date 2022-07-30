package tnsif.c2tc;

import tnsif.c2tc.entities.Counter;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		Counter c=new Counter();
		Runnable t=()->
		{
			c.counter(1000);
		};
		Runnable t1=()->
		{
			c.counter(1000);
		};
		Thread thread=new Thread(t);
		Thread thread1=new Thread(t1);
		thread.start();
		thread1.start();
		thread.join();
		thread1.join();
		System.out.println(c.count);

	}

}
