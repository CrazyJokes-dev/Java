package ExerciseCircle2D;

public class Circle2D {
	private double x, y;
	private double radius;
	
	public Circle2D() {
		x += 1;
		y = 0;
		radius = 1;
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	
	public double getPerimeter() {  //Finding The Circumference in other words
		double circumference = 2*Math.PI*radius;	
		return circumference;
	}
	
	public boolean contains(double x, double y) {
		double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
		
		if(distance <= radius)
			return true;
		else
			return false;
	}
	
	public boolean contains(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
		
		if(circle.radius+distance <= this.radius)
			return true;
		else
			return false;
	}
	
	public boolean overlaps(Circle2D circle) {
		double distance = Math.sqrt(Math.pow(circle.x - this.x, 2) + Math.pow(circle.y - this.y, 2));
		
		if(distance <= circle.radius + this.radius)
			return true;
		else
			return false;
	}
}
