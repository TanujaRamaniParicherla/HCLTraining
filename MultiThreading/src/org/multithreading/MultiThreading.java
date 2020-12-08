package org.multithreading;

public class MultiThreading implements Runnable {
	public static void main(String args[])
	{
	 Thread Thread1 = new Thread("hi");
     Thread Thread2 = new Thread("hello");
     Thread1.start();
     Thread2.start();
     System.out.println("Thread names are following:");
     System.out.println(Thread1.getName());
     System.out.println(Thread2.getName());
 


}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
