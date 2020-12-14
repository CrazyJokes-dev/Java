import java.util.Scanner;
public class Assignment4Program2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println("The maximum of " +num1+ " and " +num2+ " is: " +Math.max(num1, num2));

	}

}
