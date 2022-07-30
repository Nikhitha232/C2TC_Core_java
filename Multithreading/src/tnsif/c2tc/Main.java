package tnsif.c2tc;
import tnsif.c2tc.entities.*;
public class Main {

	public static void main(String[] args)throws InterruptedException {
		Customer c=new Customer();
		Runnable t=()->
		{
			try
			{
			c.withdrawal(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		Runnable t1=()->
		{
			c.deposit(1000);
		};
Thread thread =new Thread(t);
Thread thread1 =new Thread(t1);
thread.start();
thread1.start();
thread.join();
thread1.join();
System.out.println(c.amount);

	}

}
