
public class Rectangle {
	double width = 1;
	double height = 1;
	
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	public Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return (width*2)+(height*2);
	}
	
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(4.0, 40.0);
		//System.out.println("The area of a rectangle with width " +r.width+ " and height " +r.height+ " is " +r.getArea());
		//System.out.println("The perimeter of a rectangle is " + r.getPerimeter());
		

	}

}
