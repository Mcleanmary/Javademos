package methods;

import java.util.Scanner;

public class SumOfDigits {

	static int number;
	static int number2;

	public int input() {
		System.out.print("Enter Number : ");
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
		number2 = number;
		return number;

	}

	public int sum() {
		int sum = 0;
		while (number > 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		System.out.println("The sum of the digits of " + number2 + " is " + sum);
		return sum;
	}

	public static void main(String[] args) {
		SumOfDigits s1 = new SumOfDigits();
		s1.input();
		s1.sum();
	}
}
