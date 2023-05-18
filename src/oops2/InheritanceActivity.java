package oops2;

public class InheritanceActivity {

	public static void main(String[] args) {
		Employee case1 = new Manager(12634, "Peter", "Chennai India", 237844,65000);
		System.out.println("Salary of Manager "+case1.employeename +" is " +case1.calculateSalary());
		Employee case2 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		System.out.println("Salary of Trainee Employee "+case2.employeename +" is " +case2.calculateSalary());

	}

}
