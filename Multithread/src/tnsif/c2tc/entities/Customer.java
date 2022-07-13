package tnsif.c2tc.entities;

public class Customer {
public int amount=1000;
public void deposit(int amount)
{
	this.amount+=amount;
	System.out.println("Deposit completed");
	
}
public void withdrawal(int amount) 
{
	this.amount-=amount;
	
	System.out.println("withdrawal completed");
}

}
