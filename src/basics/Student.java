package basics;

import java.util.Scanner;

public class Student {

	static int Tamil;
	static int English;
	static int Math;
	static int Science;
	static int Social;

	public int avg() {
		int avg = (Tamil + English + Math + Science + Social) / 5;
		System.out.println("The average is "+avg);
		return avg;
	}

	public int total() {
		int total = (Tamil + English + Math + Science + Social);
		System.out.println("The Total is " +total);
		return total;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Tamil Marks-");
		Tamil = s.nextInt();
		System.out.println("Enter English Marks-");
		English = s.nextInt();
		System.out.println("Enter Math Marks-");
		Math = s.nextInt();
		System.out.println("Enter Science Marks-");
		Science = s.nextInt();
		System.out.println("Enter Social Marks-");
		Social = s.nextInt();

		Student s1 = new Student();
		s1.avg();
		s1.total();
		s.close();
	}

}
