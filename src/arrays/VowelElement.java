package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VowelElement {

	public static void main(String[] args) {
		System.out.print("Input elements seperated by space :");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		findvowel(input);

	}

	public static void findvowel(String input) {
		List<String> data = new ArrayList<String>(Arrays.asList(input.split(" ")));
		System.out.println(data);
		for (String word : data) {
			char letter = word.toLowerCase().charAt(0);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
				System.out.println(word + " Starts with Vowel");
			}

		}

	}
}
