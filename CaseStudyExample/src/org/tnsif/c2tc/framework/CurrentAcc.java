package org.tnsif.c2tc.framework;

public class  CurrentAcc extends BankAcc{
	public  final float creditLimit=50000;
	

	public CurrentAcc(int accno, String accname, float accBal)
	{
		super(accno, accname, accBal);
		
	}
}

	