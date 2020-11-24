package org.market;



public class ICICI implements MutalFund {
	private int time,intrest=60;
	private long principal, si;
	
	public ICICI(int time, long principal) {
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




