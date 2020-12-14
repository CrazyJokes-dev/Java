import java.util.Scanner;

public class readNumBackwards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter anywhere from 1 to 4000 integers terminated by a 0:");
		
		
		int[] numArr = new int[4000];
		for(int i = 0; i<numArr.length; i++) {
			int num = input.nextInt();
			if(num == 0) {
				break;
			} else {
				numArr[i] = num;
			}
		}
		
		
		System.out.print("The number(s) in reverse: ");
		for(int i = 3999; i>=0; i--) {
			if(numArr[i] != 0)
				System.out.print(numArr[i] +" ");
		}
		
	}

}
