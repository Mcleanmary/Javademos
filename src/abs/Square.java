package abs;

public class Square extends Shape {

	@Override
	public double calculateArea() {
		double area = 4 * 4;
		System.out.println("Square Area is " + area);
		return 0;
	}

}
