package interfaces;

public class Train implements IVehicle, IPublicTransport {

	@Override
	public void getNumberOfPeople() {

		System.out.println("500 people can travel in this train.");
		
	}

	@Override
	public void drive() {
		System.out.println("The train is in Drive mode.");
		
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
