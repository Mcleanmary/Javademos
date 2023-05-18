package oops;

public class NRIAccount extends BankAccount {

	public double applyFixedDeposit() {
		super.interestrate = 6.5;
		System.out.println(interestrate+ " for NRIs");
		return interestrate;

	}

	//public static void main(String[] args) {
		//NRIAccount n = new NRIAccount();
		//n.applyFixedDeposit(6.5);
		//System.out.println(interestrate);
	//}
}
