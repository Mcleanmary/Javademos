package basics;

import java.util.Scanner;

public class SumofoddDigits {
	static int number;

	public static void main(String[] args) {
		UserMainCode u = new UserMainCode();
		System.out.print("Enter Number :");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		u.checkSum(number);
	}
}

class UserMainCode {

	void checkSum(int number) {

		int sum = 0;

		while (number > 0) {
			int x = number % 10;

			if (x % 2 != 0) {
				sum = sum + x;
			}
			number = number / 10;

		}
		if (sum % 2 == 0) {
			System.out.println(sum + "- Sum is even.");

		} else {
			System.out.println(sum + "- Sum is odd.");
		}
	}

}
