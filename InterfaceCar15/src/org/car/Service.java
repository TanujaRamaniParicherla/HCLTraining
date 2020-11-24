package org.car;

public class Service implements Car {
	private String brand;
	private int sum = 0, years, n, number;
	int service = 5000;

	public Service(String brand, int number, int years) {
		super();
		this.brand = brand;
		this.number = number;
		this.years = years;
	}

	public void sum() {

		int sum1 = this.number;
		while (sum1 != 0) {
			n = sum1 % 10;
			sum = sum + n;
			sum1 = sum1 / 10;
		}
		System.out.println(sum);
		if (sum % 2 == 0) {
			System.out.println("You can come on Tuesday, Thursday or Saturday");
		} else {
			System.out.println("You can come on Monday, Wednesday or Friday.");
		}
	}

	public void years() {

		int y = this.years;
		if (y > 5) {
			System.out.println("You are eligible for free washing .");
		} else {
			System.out.println("You are not eligible for free washing .");
		}
	}

	public void brand() {

		String s = this.brand;
		String c = "Maruthi";
		if (s.equals(c)) {

			System.out.println("Your servicing charges are-4750");
		} else {
			System.out.println("Your servicing charges are-" + service);
		}
	}

}
