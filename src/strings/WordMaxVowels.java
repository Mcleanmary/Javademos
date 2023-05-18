package strings;

import java.util.Scanner;

public class WordMaxVowels {

	public void vowel(String input) {
		int length = input.length();
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int counter = 0; counter < length; counter++) {

			if (input.charAt(counter) == 'a') {
				a = 1;
			} else if (input.charAt(counter) == 'e') {
				e = 1;
			} else if (input.charAt(counter) == 'i') {
				i = 1;
			} else if (input.charAt(counter) == 'o') {
				o = 1;
			} else if (input.charAt(counter) == 'u') {
				u = 1;
			}
		}
		System.out.println(a + e + i + o + u);
	}

	public static void main(String[] args) {
		System.out.print("Enter input: ");
		Scanner sc = new Scanner(System.in);
		WordMaxVowels v = new WordMaxVowels();
		v.vowel(sc.nextLine());
	}
}
