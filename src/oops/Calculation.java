package oops;

import java.util.Scanner;

public class Calculation {

	double sum;

	public double add(double num1, double num2) {
		sum = num1 + num2;
		System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
		return sum;

	}

	public double add(double num1, double num2, double num3) {
		sum = num1 + num2 + num3;
		System.out.println("The sum of " + num1 + " , " + num2 + " , " + num3 + " is " + sum);
		return sum;
	}

	public double add(double num1, double num2, double num3, double num4) {
		sum = num1 + num2 + num3 + num4;
		System.out.println("The sum of " + num1 + " , " + num2 + " , " + num3 + " , " + num4 + " is " + sum);
		return sum;

	}

	public static void main(String[] args) {
		Calculation c = new Calculation();
		System.out.print("Enter Number1 : ");
		Scanner s = new Scanner(System.in);
		double input1 = s.nextInt();
		System.out.print("Enter Number2 : ");
		s = new Scanner(System.in);
		double input2 = s.nextInt();
		System.out.print("Enter Number3 : ");
		s = new Scanner(System.in);
		double input3 = s.nextInt();
		System.out.print("Enter Number4 : ");
		s = new Scanner(System.in);
		double input4 = s.nextInt();
		c.add(input1, input2);
		c.add(input1, input2, input3);
		c.add(input1, input2, input3, input4);

	}
}
