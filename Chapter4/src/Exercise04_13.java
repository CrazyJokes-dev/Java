import java.util.Scanner;
public class Exercise04_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println((char) '+');
		
		System.out.print("Enter a letter: ");
		char letter = input.next().charAt(0);
		
		
		
		if ((letter >=(char)65 && letter <= (char)90) || (letter >=(char)97 && letter <= (char)122)) {
			switch (letter) {
				case 'A': 
				case 'E':
				case 'I':
				case 'O':
				case 'U':
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u': System.out.println(letter + " is a vowel"); break;
					
				default: System.out.println(letter + " is a consonant"); break;
			}
		} else {
			System.out.println(letter + " is an invalid input");
		}	
			 
			
	}

}