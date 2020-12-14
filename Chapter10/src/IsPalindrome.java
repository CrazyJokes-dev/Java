import java.util.Scanner;

public class IsPalindrome {

	public static char[] putInArray(String s) {
		char[] arr = new char[s.length()];
		for(int i = 0; i<s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)))
				arr[i] = s.charAt(i);
		}
		
		return arr;
	}
	
	public static char[] reverse(String s) {
		char[] arr = new char[s.length()];
		for(int i = 0; i<s.length()/2; i++) {
			arr[i] = s.charAt(s.length()-(i+1));
		}
		
		
		return arr;
		
	}
	
	
	public static boolean isPalindrome(String s) {
		char[] arr = putInArray(s);
		
		char[] reverse = reverse(s);
		
		return arr.equals(reverse);
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a string: ");
		String palin = input.nextLine();
		
		System.out.println(isPalindrome(palin));
		
	}
		
	

}
