package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();

		// print the sum of three numbers
		int sum = obj.add(12, 13, 14);
		System.out.println(" Sum of three numbers: " + sum);

		// print the subtraction of two numbers
		int sub = obj.sub(25, 13);
		System.out.println(" Sub of two numbers: " + sub);

		// print the multiplication of two numbers
		double mul = obj.mul(250000.99999999, 10000.88888);
		System.out.println(" Product of two double numbers: " + mul);

		// print the division of two numbers
		float div = obj.div(100000.00f, 10.00f);
		System.out.println(" Division of two float numbers: " +div);
	}

}
