package oops;

public class BankAccount {

	double balance;
	double deposit = 34;
	double draw = 3;
	double interestrate = 9.5;

	public double depositMoney() {
		System.out.println("deposit=" + deposit);
		return deposit;

	}

	public double withdrawMoney() {
		System.out.println("With Draw=" + draw);
		balance = deposit - draw;
		System.out.println(balance);
		return balance;

	}

	
}