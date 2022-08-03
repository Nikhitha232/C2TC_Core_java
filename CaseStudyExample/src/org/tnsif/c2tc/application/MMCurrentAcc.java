package org.tnsif.c2tc.application;

import org.tnsif.c2tc.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accno, String accname, float accBal) {
		super(accno, accname, accBal);
		
	}

	@Override
	public void withdraw(float accBal) {
		
		System.out.println("you have withdraw the amount"+accBal+" with creditLimit "+creditLimit);
	}

		
	

}
