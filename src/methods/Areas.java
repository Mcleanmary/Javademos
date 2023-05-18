package methods;

public class Areas {

	public double circle(int r) {
		double area = (3.14 * r * r);
		System.out.println(area+" is the Area of the circle with radius "+r+ " units.");
		return area;
	}

	public double triangle(int b, int h) {
		double area = (0.5 * b * h);
		System.out.println(area+" is the Area of the triangle with base "+b+ " and height "+h);
		return area;
	}

	public static double rectangle(int l, int w) {
		double area = (l * w);
		System.out.println(area+" is the Area of the rectangle with length "+l+" and width "+w);
		return area;
	}

	
public static void main(String[] args) {
	Areas shapes=new Areas();
	shapes.circle(5);
	shapes.triangle(5,7);
	rectangle(5,7);
}
}
