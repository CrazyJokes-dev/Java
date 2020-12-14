import java.util.Scanner;
public class Assignment4Program3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three distinct integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		int lowMax = Math.max(num1, num2);
		
		System.out.println("The maximum is: " +Math.max(lowMax, num3));
	}

}
