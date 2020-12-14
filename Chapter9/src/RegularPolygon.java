
public class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon() {
		
	}
	
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}
	
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public void setNumSides(int n) {
		this.n = n;
	}
	
	public int getNumSides() {
		return n;
	}
	
	public void setSideLength(double side) {
		this.side = side;
	}
	
	public double getSideLength() {
		return side;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}
	
	public double getPerimeter() {
		return side*n;
	}
	
	public double getArea() {
		double Area = n*Math.pow(side, 2)/(4*Math.tan(Math.PI/n));
		return Area;
	}
	
	public static void main(String[] args) {
		
	}

}
