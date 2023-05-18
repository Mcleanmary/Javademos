package oops;

public class Cylinder extends Circle {
	
	int height;
	float areaCylinder;
	
	Cylinder(int height){
		this.height=height;
		System.out.println(height);
	}
	
	public float areaCylinder(int height) {
		System.out.println(super.areaCircle+"as"+super.radius);
		float areaCylinder= (float) ((2*3.14*super.radius*height)+ (2*super.areaCircle));
		System.out.println(height);
		System.out.println(areaCylinder);
		return areaCylinder;
		
	}

	public static void main(String[] args) {
		Cylinder cy1=new Cylinder(12);
		cy1.areaCircle(3);
		cy1.areaCylinder(12);
		}
}