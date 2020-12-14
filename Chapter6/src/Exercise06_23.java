import java.util.Scanner;
public class Exercise06_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String phrase = input.nextLine();
		
		System.out.print("Enter a character: ");
		char Character = input.next().charAt(0);
		
		
		System.out.println("The number of occurrences of " +Character+ " in " +phrase+ " is " +count(phrase, Character));
		
	}
	
	public static int count(String str, char a) {
		int timesOccurred = 0;
		
		for(int i = 0; i<str.length(); i++) {
			if(str.toUpperCase().charAt(i) == Character.toUpperCase(a)) {
				timesOccurred++;
			}
			
		}
		
		
		return timesOccurred;
	}
}
