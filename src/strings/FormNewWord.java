package strings;

import java.util.Scanner;

public class FormNewWord {

	public static void main(String[] args) {
		System.out.print("Enter the Word :");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		System.out.print("Enter the size :");
		int size=sc.nextInt();
		
		int length=input.length();
		
		if (length>=2*size) {
			StringBuffer newWord= new StringBuffer("");
			for (int i=0;i>size;i++) {
				newWord.append(input.charAt(i));
				System.out.println(newWord);
			}
		}
		
	}
}
