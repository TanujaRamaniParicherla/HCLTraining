package org.market;


public class HDFC implements MutalFund {
	private int time,intrest=49;
	private long principal, si;
	
	public HDFC(int time, long principal) {
		super();
		this.time = time;
		this.principal = principal;
	}
	public void duration()
	{
		si=(principal*time*intrest)/100;
		//return 0;
	}
	public long amount()
	{
		//System.out.println(si);
		return si;
	}
	

}



