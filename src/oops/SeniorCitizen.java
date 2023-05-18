package oops;

public class SeniorCitizen extends BankAccount {

	public double applyFixedDeposit() {
		super.interestrate = 10.5;
		System.out.println(interestrate+ " For Seniors");
		return interestrate;

	}

	//public static void main(String[] args) {
		//SeniorCitizen n = new SeniorCitizen();
		//n.applyFixedDeposit(10.5);
		//}
}
