package org.multilevel;


public class FixedAccount extends SavingAccount{
	protected int lockingPeriod;

	public int getLockingPeriod() {
		return lockingPeriod;
	}

	public void setLockingPeriod(int lockingPeriod) {
		this.lockingPeriod = lockingPeriod;
	}
	
}
