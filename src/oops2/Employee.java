package oops2;

public class Employee {

	long employeeid;
	String employeename;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;

	Employee(long id, String name, String address, long phone) {
		employeeid = id;
		employeename = name;
		employeeAddress = address;
		employeePhone = phone;

	}

	public double calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
		System.out.println("Employee-Calculated Salary =" + salary);
		return salary;

	}
}

class Manager extends Employee {

	Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		super.basicSalary = salary;

	}
}

class Trainee extends Employee {

	Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address, phone);
		super.basicSalary = salary;

	}

}
