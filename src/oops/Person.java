package oops;

public class Person {

	private String name;
	private String occupation;
	private static int age;
	private double salary;

	Person() {
		
	}
	
	Person(String name, String occupation, double salary) {
		this.name = name;
		this.occupation = occupation;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Person.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	
}
