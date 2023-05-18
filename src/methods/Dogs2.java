package methods;

public class Dogs2 {

	String name;
	String breed;
	int age;
	
	Dogs2(String name) {
		this.name = name;
		}
	
	public static void main(String[] args) {
		Dogs2 display1=new Dogs2("Coco");
		System.out.println("My Dog's name is "+ display1.name);
	}
}
