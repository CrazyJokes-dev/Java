import java.util.Scanner;
public class Assignment4Program4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three integers and you will get the median: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		int lowMax = Math.max(num1, num2);
		int actualMax = Math.max(lowMax, num3);
		
		int highMin = Math.min(num1, num2);
		int actualMin = Math.min(highMin, num3);
		
		int total = num1 + num2 + num3;
		
		int median = (total-actualMax)-actualMin;
		
		System.out.println("The median is: " +median);
	}

}
