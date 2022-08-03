package org.tnsif.c2tc.application;

import org.tnsif.c2tc.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accno, String accname, float accBal) {
		super(accno, accname, accBal);
		
	}

	@Override
	public void withdraw(float accBal) {
		
		System.out.println("you have withdraw the amount"+accBal);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [isIssalary()=" + isIssalary() + ", toString()=" + super.toString() + ", getAccno()="
				+ getAccno() + ", getAccname()=" + getAccname() + ", getAccBal()=" + getAccBal() + "]";
	}
	

	

	
	
	

}
