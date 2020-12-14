import java.util.Scanner;
public class Exercise05_49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numVowels = 0;
		int numConsonants = 0;
		
		System.out.print("Enter a string: ");
		String s = input.nextLine().toUpperCase();
		
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <=90) {
				
				if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') 
					numVowels++;
				else
					numConsonants++;
			}
		}
		
		System.out.println("The number of vowels is " + numVowels);
		System.out.println("The number of consonants is " + numConsonants);
		
	}

}
