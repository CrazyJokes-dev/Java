import java.util.Scanner;
public class UserControlLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Controlling Loops by User input and Sentinel Values 1 //
		/**
		while (input.hasNextLine()) {
			System.out.print(input.nextLine() + " ");
		}
		**/
		
		
		
		// Check longest strings and see how many of them there are //
		int count = 0;
		int longest = 0;//input.next().length();
		String newString = "";
		
		while (input.hasNext()) {
			
			
			if (input.next().length() > longest) {
				longest = input.next().length();
				
				
				System.out.println(longest);
			} else if (input.next().length() == longest) {
				count++;
				
				System.out.println(count);
			}
			System.out.println(longest);
		}
		
		
	}

}
