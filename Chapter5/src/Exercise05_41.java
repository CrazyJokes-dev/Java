import java.util.Scanner;
public class Exercise05_41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	
		int n = -1;
		int max = -1;
		int countMax = 1;
		while(n != 0) {
			System.out.print("Enter an integer (0: for end of input): ");
			n = input.nextInt();
			
			if(n == max) 
				countMax++;
			if (n > max) {
				max = n;
				countMax = 1;
			}
		}
		System.out.println("The largest number is " +max);
		System.out.println("The occurrence count of the largest number is " +countMax);
		
		
	}

}
