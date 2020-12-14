import java.util.Scanner;
public class summation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		int total = 0;
		// Main Script //
		
		System.out.print("The integers from 0 to " +num+ " are: ");
		for(int i = 0; i<=num; i++) {
			System.out.print(i);
		}
		System.out.println("");
		
		System.out.print("The summation from 0 to " +num+ " is: ");
		for(int i = 0; i<=num; i++) {
			total += i;
		}
		System.out.print(total);
	}

}
