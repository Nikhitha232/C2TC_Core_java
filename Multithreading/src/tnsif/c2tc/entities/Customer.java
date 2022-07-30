package tnsif.c2tc.entities;

public class Customer {
	public int amount=1000;
	public synchronized void deposit(int amount)
	{
		this.amount+=amount;
		System.out.println("Deposit completed");
		notify();
	}
	public void withdrawal(int amount) throws InterruptedException
	{
		if(this.amount<amount)
		{
		System.out.println("Insufficient balance");
		wait();
	}
		this.amount-=amount;
		System.out.println("withdrawal completed");

}
}
