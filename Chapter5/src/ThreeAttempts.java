import java.util.Scanner;

public class ThreeAttempts {
	public static void main(String[] args) {
		//System.out.println("John Doe".indexOf("ohn")); is 1
		//System.out.println(11%13);
		double gpa=3.5;
		int age=20;
		System.out.printf("%5d%5.2f", age, gpa);
		
		
		int number1 = (int)(Math.random()* 10);
		int number2 = (int)(Math.random()* 10);
		int count = 2;
		//Create a Scanner
		
		Scanner input = new Scanner(System.in);
		//System.out.print("What is " + number1 + " + " + number2 + "?");
		int answer = input.nextInt();
		
			
		while (number1 + number2 != answer && count > 0) {
			System.out.print(count +  " attempts left. Try again. " + "What is " + number1 + " + " + number2 + "?");
			answer = input.nextInt();
			count--;
		}
			
		if (number1 + number2 == answer && count > 0)	
			System.out.println("You got it!");	
		else {
			System.out.println("Better luck next time!");
		}	
		
		
		
	}

}
