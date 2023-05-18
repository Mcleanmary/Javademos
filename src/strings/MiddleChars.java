package strings;

import java.util.Scanner;

public class MiddleChars {

	public static void getMiddleChars() {
		System.out.print("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int l = input.length();
		if (l % 2 <= 0) {
			int middle = (l / 2) - 1;
			int next = middle + 1;
			System.out.print(input.charAt(middle) + "" + input.charAt(next) + "");
		} else {
			System.out.println("Invalid.");
		}

	}
}
