package oops;

public class Circle {

	int radius;
	float areaCircle;
	
	Circle() {
		System.out.println("Trying Super class");	}
	
	Circle(int radius){
	this.radius=radius;
	System.out.println(radius);
	}
	
	public float areaCircle(int radius) {
		float areaCircle=(float) (3.14*radius*radius);
		System.out.println("Circle area " +areaCircle);
		return areaCircle;
		
	}
	
	public static void main(String[] args) {
	Circle c1=new Circle(2);
	c1.areaCircle(2);
	}
}
