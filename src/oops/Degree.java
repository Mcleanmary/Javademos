package oops;

public class Degree {

	public void getDegree() {
		System.out.println("I got a Degree.");
	}
}

class Undergraduate extends Degree {

	public void getDegree() {
		System.out.println("I am an Under Graduate.");

	}
}
class Postgraduate extends Degree{
		
		public void getDegree() {
			System.out.println("I am a Post Graduate.");

		}
}
