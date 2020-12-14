import java.util.Scanner;
public class ReadAndAdd2Integers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the two integers to be added: ");
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println("The sum is: " + (x+y));
	}

}
