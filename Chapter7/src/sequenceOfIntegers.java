import java.util.Scanner;
public class sequenceOfIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int greaterthan0 = 0;
		int lessthan0 = 0;
				
		System.out.print("Enter a sequence of integers terminated by 0: ");
		int num = input.nextInt();
		
		// Main Script //
		while(num != 0) {
			if(num > 0)
				greaterthan0++;
			else if(num < 0)
				lessthan0++;
		
		num = input.nextInt();
		}
		
		System.out.println("There are " +greaterthan0+ " greater than 0 and " +lessthan0+ " less than 0");

	}

}
