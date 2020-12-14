package problem2;

public class Driver {

	public static void main(String[] args) {
		Odometer odo = new Odometer(100);
		
		odo.addMilesDriven(67.2);
		odo.setFuelEfficiency(22);
		odo.resetToZero();
		odo.addMilesDriven(153.4);
		odo.viewStats();
		System.out.println("Gallons Consumed: " +odo.gallonsConsumed());
		
	}

}
