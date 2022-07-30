package tnsif.c2tc.entities;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	public AtomicInteger count;
	public Counter() {
		count=new AtomicInteger(100);
	}
	public void counter(int n)
	{
		for(int i=0;i<n;i++)
			count.addAndGet(1);
	}

}
