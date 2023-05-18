package abs;

import java.util.Scanner;

public abstract class Shape {

	String color;
	
	public abstract double calculateArea();

	public void setColor() {
		System.out.print("Enter Color : ");
		Scanner co = new Scanner(System.in);
		color =co.nextLine();
		System.out.println("Color is "+color);
		co.close();

	}
}
