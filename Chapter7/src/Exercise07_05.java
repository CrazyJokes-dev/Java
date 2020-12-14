import java.util.Scanner;
public class Exercise07_05 {

	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	/*   Not using this because it's more efficient to just not print the zeros using a for loop with a 2 nested if statements
	
	public static void findZeroShiftLeft(int[] arr) {
		int[] arr2 = new int[arr.length];
		for(int i = 0; i<arr.length; i++) {
			arr2[i] = arr[i];			
		}
		
		int k,j;
		for(k = 0; k<arr2.length; k++) {
			if(arr2[k] == 0) {
				for(j = k+1; j<arr2.length; j++) {
					arr2[j-1] = arr2[j];
				}
				
			}
		}
		
	}
	*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Variables //
		System.out.print("Enter ten numbers: ");
		int[] numChosen = new int[10];
		int num;
		boolean duplicate = false;
		int counter = 0;
		
		do {
			num = input.nextInt();
			
			for(int k = 0; k<numChosen.length; k++) {
				if (num == numChosen[k])
					duplicate = true;
			}
			if(duplicate == false)
				numChosen[counter] = num;
			duplicate = false;
			counter++;
			
		}while(counter < 10);
		
		// Main Script //
		
		int noZeroTotal = 0;
		for(int i = 0; i<numChosen.length; i++) {
			if(numChosen[i] != 0)
				noZeroTotal++;
		}
		System.out.println("The number of distinct number is " + noZeroTotal);
		
		
		System.out.print("The distinct numbers are: ");
		boolean isZero = false;
		for(int i = 0; i<numChosen.length; i++) {
			isZero = false;
			
			if(numChosen[i] == 0)
				isZero = true;
			if(isZero == false)
				System.out.print(numChosen[i] + " ");
		}
		
		
		
		
	}

}
