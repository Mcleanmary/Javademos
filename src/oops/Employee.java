package oops;

public class Employee extends Person {

	private String role;

	Employee(String role) {
		this.role = role;
	}

	public String getrole() {
		return role;
	}

	public void setrole(String roles) {
		this.role = roles;
	}

	public String getName() {
		return getName();
	}

	public void setName(String name) {
		super.setName(name);
	}

	public String getOccupation() {
		return getOccupation();
	}

	public void setOccupation(String occupation) {
		super.setOccupation(occupation);
	}

	public static void main(String[] args) {
		Person p = new Person("Sri", "Singer", 100);

		System.out.println("Name is: " + p.getName());
		System.out.println("Occupation is: " + p.getOccupation());
		System.out.println("Salary is " + p.getSalary());

	}
}
