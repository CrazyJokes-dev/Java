import java.util.Scanner;
public class Exercise07_01 {

	public static void printArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static char gradingScores(int[] arr, int numGrade) {
		// We need to get a max first
		int max = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		//Now we can start grading
		
		if(numGrade >= max-10)
			return 'A';
		else if(numGrade >= max-20)
			return 'B';
		else if(numGrade >= max-30)
			return 'C';
		else if(numGrade >= max-40)
			return 'D';
		else
			return 'F';
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Getting the variables //
		
		System.out.print("Enter the total number of students: ");
		int numStudents = input.nextInt();
		
		System.out.print("Enter " +numStudents+ " scores: ");
		int[] scores = new int[numStudents];
		for(int i = 0; i<scores.length; i++) {
			scores[i] = input.nextInt();
		}
		
		//Main Script
		
		for(int i = 0; i<scores.length; i++) {
			System.out.println("Student " +i+ " score is " +scores[i]+ " and grade is " +gradingScores(scores, scores[i]));
		}
	}

}
