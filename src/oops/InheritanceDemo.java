package oops;

public class InheritanceDemo {

	public static void main(String[] args) {
		NRIAccount n = new NRIAccount();
		n.applyFixedDeposit();
		
		SeniorCitizen s = new SeniorCitizen();
		s.applyFixedDeposit();
		
		BankAccount b = new BankAccount();
		b.depositMoney();
		b.withdrawMoney();
		
		
}
	
}
