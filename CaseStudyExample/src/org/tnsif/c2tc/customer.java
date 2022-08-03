package org.tnsif.c2tc;

import org.tnsif.c2tc.application.MMBankFactory;
import org.tnsif.c2tc.application.MMCurrentAcc;
import org.tnsif.c2tc.application.MMSavingAcc;
import org.tnsif.c2tc.framework.BankFactory;
import org.tnsif.c2tc.framework.CurrentAcc;
import org.tnsif.c2tc.framework.SavingAcc;

public class customer {
	public static void main(String args[])
	{
		BankFactory bf=new MMBankFactory();
		SavingAcc sa= new MMSavingAcc(1234, "nikitha", 40000);
		sa.deposite(7000);
		CurrentAcc ca=new MMCurrentAcc(3456,"thanu",30000);
		ca.withdraw(6000);
		
	}

}
