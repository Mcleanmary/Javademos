package abs;

public class Circle extends Shape{

	@Override
	public double calculateArea() {
		double area=3.14*5*5;
		System.out.println("Circle Area is "+area);
		return area;
	}
	
	
}
