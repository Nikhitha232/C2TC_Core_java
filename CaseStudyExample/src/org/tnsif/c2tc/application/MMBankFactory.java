package org.tnsif.c2tc.application;

import org.tnsif.c2tc.framework.BankFactory;
import org.tnsif.c2tc.framework.CurrentAcc;
import org.tnsif.c2tc.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accno, String accname, float accBal) {
		SavingAcc sa=new SavingAcc(accno, accname, accBal);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accno, String accname, float accBal) {
		CurrentAcc ca=new CurrentAcc (accno, accname, accBal);
		return ca;
	}
	

}
