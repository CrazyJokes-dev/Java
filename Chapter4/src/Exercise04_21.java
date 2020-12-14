import java.util.Scanner;
public class Exercise04_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		String SSN = input.next();
		
		if(SSN.length() == 11) {
			
			
			for(int i = 0; i<11; i++) {
				
				if (!((SSN.charAt(i) > (char)45 && SSN.charAt(i) < (char)57) || SSN.charAt(i) == (char)45)) {
					
					System.out.println(SSN + " is an invalid social security number");
					System.exit(1);
					
				}
			}
			System.out.println(SSN + " is a valid social security number");
			
		} else {
			System.out.println(SSN + " is an invalid social security number");
		}
		
		
		
			
				
	}

}
