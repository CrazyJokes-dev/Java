package problem2;

public class Odometer {
	private double milesDriven;
	private double fuelEfficiency;
	
	public Odometer(double milesDriven) {
		this.milesDriven = milesDriven;
	}
	
	public void viewStats() {
		System.out.println("Miles Driven: " +milesDriven);
		System.out.println("Fuel Efficiency: " +fuelEfficiency);
	}
	
	public void resetToZero() {
		milesDriven = 0;
	}
	
	public void setFuelEfficiency(double milesPerGallon)  {
		fuelEfficiency = milesPerGallon;
	}
	
	public void addMilesDriven(double miles) {
		milesDriven += miles;
	}
	
	public double gallonsConsumed() {
		return (double)milesDriven/fuelEfficiency;
	}
	
	public static void main(String[] args) {
		
		
	}

}
