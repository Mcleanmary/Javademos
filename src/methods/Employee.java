package methods;

public class Employee {
	public String name;
	public int id;
	
	void printID() {
		System.out.println("Employee ID "+id);
	}
	Employee(){
		name="xyz";
		id=23;
						
	}
	
	public static void main(String[] args) {
		Employee e=new Employee();
	}
}
