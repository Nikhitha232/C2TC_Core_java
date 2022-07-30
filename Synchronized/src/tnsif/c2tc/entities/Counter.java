package tnsif.c2tc.entities;

public class Counter {
	public int count=100;
	public synchronized void counter(int n)
	{
		for(int i=0;i<n;i++)
			count++;
	}

}
