package strings;

import java.util.Scanner;

public class UserMainCode2 {

	public void checkCharacters() {
		System.out.print("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int l = input.length();
		char first = input.charAt(0);
		char last = input.charAt(l-1);

		if (first == last) {
			System.out.println("1");
		} else {
			System.out.println("-1");
		}

	}
}
