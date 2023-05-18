package interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		Car polo=new Car();
		polo.checkMotor();
		polo.drive();
		polo.turnLeft();
		polo.brake();
		Train sathapthi=new Train();
		sathapthi.getNumberOfPeople();
		sathapthi.drive();
		sathapthi.turnLeft();
		sathapthi.brake();
		
	}

}
