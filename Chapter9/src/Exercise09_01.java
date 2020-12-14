
public class Exercise09_01 {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(4.0, 40.0);
		Rectangle r1 = new Rectangle(3.5, 35.9);
		System.out.println("The area of a rectangle with width 4.0 and height 40.0  is " +r.getArea());
		System.out.println("The perimeter of a rectangle is " + r.getPerimeter());
		System.out.println("The area of a rectangle with width 3.5 and height 35.9  is " +r1.getArea());
		System.out.println("The perimeter of a rectangle is " + r1.getPerimeter());
	}

}
