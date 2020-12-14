import java.util.Scanner;
public class Assignment4Program1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer and I'll tell you if it is odd or even: ");
		int num = input.nextInt();
		
		if(num%2 == 0) 
			System.out.println(num+ " is EVEN");
		else
			System.out.println(num+ " is ODD");
		
	}

}
