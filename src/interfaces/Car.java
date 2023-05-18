package interfaces;

public class Car extends MotorisedVehicle implements IVehicle{

	@Override
	public void drive() {
		System.out.println("The car is in drive mode.");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("The left turn indicator is ON.");
		
	}

	@Override
	public void brake() {
		System.out.println("The car is in brake mode.");
		
	}

}
