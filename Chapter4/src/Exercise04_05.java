import java.util.Scanner;

public class Exercise04_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/** Variables **/
		System.out.print("Enter the number of sides on the polygon: ");
		int n = input.nextInt(); //Number of sides
		System.out.print("Enter the length of sides on the polygon: ");
		double s = input.nextDouble(); //Length of sides
		double area = n*Math.pow(s, 2)/(4*Math.tan(Math.PI/n));
		
		/** Main Script **/
		
		System.out.println("The area of the polygon is " + area);
	}

}
