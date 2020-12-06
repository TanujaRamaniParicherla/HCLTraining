package org.java8.features;

public class OTP {

	public static void main(String[] args)
		// TODO Auto-generated method stub
		Supplier<Integer> s =()->{
			int[] s1={1234,1256,56765,7867};
			int x =(int)(Math.random()*4);
			return s1[x];
			};
			System.out.println("OTPS are:");
			System.out.println(s.get());
			System.out.println(s.get());
			System.out.println(s.get());
			System.out.println(s.get());

	}

}
