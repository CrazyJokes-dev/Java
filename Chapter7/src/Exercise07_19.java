import java.util.Scanner;
public class Exercise07_19 {

public static boolean isSorted(int[] list) {
	boolean isSorted = false;
	for(int i = 0; i<list.length-1; i++) {
		if(list[i+1] >= list[i]) {
			isSorted = true;
		} else {
			isSorted = false;
			break;
		}
	}
	
	return isSorted;
}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Variables //
		System.out.print("Enter list: ");
		int arrayLength = input.nextInt(); //This tells us how long the array will be
		int[] numsChosen = new int[arrayLength]; 
		
		for(int i = 0; i<numsChosen.length; i++) {
			numsChosen[i] = input.nextInt();
		}
		
		// Main Script //
		
		if(isSorted(numsChosen))
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
		

	}

}
