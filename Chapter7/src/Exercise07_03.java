import java.util.Scanner;
public class Exercise07_03 {

	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] increaseArraySize(int[] arr) {
		
		int[] copy = new int[arr.length + 1];
		
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Getting the Variables //
		int i = 0;
		int counter = 0;
		
		System.out.print("Enter the integers between 1 and 100: ");
		int[] numbers = new int[1];
		
		int num = input.nextInt();
		
		while(num != 0) {
			numbers[i] = num;
			num = input.nextInt();
			if(num != 0) {
				numbers = increaseArraySize(numbers);
				
			}
			
			i++;
		}
	
		// Main Script //
		for(int k = 1; k<=100; k++) {
			counter = 0;
			for(int j = 0; j<numbers.length; j++) {
				if(k == numbers[j]) 
					counter++;
			}
			
			
			if(counter > 1) 
				System.out.println(k+ " occurs " +counter+ " times");
			else if(counter > 0)
				System.out.println(k+ " occurs " +counter+ " time");
				
		}
		
	}

}
