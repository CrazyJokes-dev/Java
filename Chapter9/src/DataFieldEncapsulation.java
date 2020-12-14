
public class DataFieldEncapsulation {
	
	private double radius = 1;
	
	private static int numberOfObjects = 0;
	
	public DataFieldEncapsulation() {
		numberOfObjects++;
	}
	
	public DataFieldEncapsulation(double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = (newRadius >= 0) ? newRadius : 0;
	}
	
	public static int getNumberOfObject() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public static void main(String[] args) {
		DataFieldEncapsulation circle = new DataFieldEncapsulation(40);
		DataFieldEncapsulation.numberOfObjects = 50;
		System.out.println(DataFieldEncapsulation.getNumberOfObject());
		circle.radius = -100;
	}

}
