import java.util.Scanner;
public class DisplayNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = 1;
		int sumEven = 0;
		int sumOdd = 0;
		int countEven = 0;
		int countOdd = 0;
		
		
		while(n > 0) {
			n = input.nextInt();
			
			if (n > 0) {
				if ((n%2) == 0) {
					sumEven += n;
					countEven++;
				} else if((n%2) != 0) {
					sumOdd += n;
					countOdd++;
				}
			}	
		}
		System.out.print(sumEven +" "+ sumOdd +" "+ countEven +" "+countOdd);
		
	}

}
