import java.util.Scanner;
public class Exercise06_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an Integer: ");
		int userNum = input.nextInt();
		
		System.out.print("Enter the width: ");
		int totalDigits = input.nextInt();
		
		System.out.println(format(userNum, totalDigits));
	}

	public static String format(int number, int width) {
		
		String formattedNum = "";
		
		for(int i = 0; i<=width; i++) {
			int numCharLeft = width-i; 
			
			//It detects how many characters are left to input and sees if that amount is equal to the length of the number
			//If it isn't then that means it needs to print more zeros
			if(numCharLeft != Integer.toString(number).length()) {
				
				formattedNum += "0";
			} else {   
				//If it is equal to the length of number, then that means printing the number would finish the width
			
				formattedNum += number;
				break;
			}
		}
		
		return formattedNum;
	}
}
