package org.tnsif.c2tc.framework;

public class SavingAcc extends BankAcc {
	

	public SavingAcc(int accno, String accname, float accBal) {
		super(accno, accname, accBal);
		
	}

	private static boolean issalary=true;

	
	public boolean isIssalary() {
		return issalary;
	}

	public void setIssalary(boolean issalary) {
		this.issalary = issalary;
	}

	@Override
	public String toString() {
		return "SavingAcc [issalary=" + issalary + ", getAccno()=" + getAccno() + ", getAccname()=" + getAccname()
				+ ", getAccBal()=" + getAccBal() + "]";
				
	}
	

}
