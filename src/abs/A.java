package abs;

public class A extends Marks {

	double mark1, mark2, mark3;

	A(double mark1, double mark2, double mark3) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;

	}

	@Override
	double getPercentage() {

		double percentage = (mark1 + mark2 + mark3) / 3;
		System.out.println("The Percentage of Student A is " + percentage);

		return percentage;
	}

}
