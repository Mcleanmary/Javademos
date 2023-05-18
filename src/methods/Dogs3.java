package methods;

public class Dogs3 {

	String name;
	String breed;
	int age;
	
	Dogs3() {
		System.out.println("Dogs are pet animals.");}
	

	Dogs3(String name) {
		this.name = name;
		System.out.println("My Dog's name is "+ name);

		}
	Dogs3(String name,String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		}
	
	public static void main(String[] args) {
		Dogs3 display2 = new Dogs3();
		System.out.println();
		Dogs3 display3 = new Dogs3("Coco");
		System.out.println();
		Dogs3 display1=new Dogs3("Coco","Poodle", 2);
		System.out.println("My Dog's name is "+ display1.name);
		System.out.println("Its a "+ display1.breed);
		System.out.println("He is "+display1.age+" years old.");

	}
}
