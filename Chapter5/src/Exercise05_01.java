import java.util.Scanner;
public class Exercise05_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numOfTimes = 0;
		int numPositive = 0;
		int numNegative = 0;
		double Total = 0;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		
		 while(true) {
			 
			 int numIntegers = input.nextInt();
			 
			 if (numIntegers < 0) {
				 numNegative++;
				 
				 numOfTimes++;
				 Total += numIntegers;
			 } else if (numIntegers > 0) {
				 numPositive++;
				 
				 numOfTimes++;
				 Total += numIntegers;
			 } else if (numIntegers == 0) {
				 break;
			 }
			// System.out.println(Total);
		 }
		 
		 float avg = (float) (Total/numOfTimes);
		 
		 if (numOfTimes == 0)
			 System.out.println("No numbers are entered except 0");
		 else {
			 System.out.println("The number of positives is " +numPositive);
		 	 System.out.println("The number of negatives is " +numNegative);
		 	 System.out.println("The total is " +Total);
		 	 System.out.println("The average is " +avg);
		 } 
		 
	}

}
