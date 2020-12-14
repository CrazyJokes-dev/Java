import java.util.Scanner;
public class Exercise06_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("The amount invested: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		
		//Now we need to calculate the monthlyInterestRate from the annualInterestRate
		double monthlyInterestRate = (annualInterestRate/12)/100;
		
		int year = 0;
		System.out.printf("%1s %s%n", "Years", "Future Value");
		for(int i = 1; i<=30; i++) {
			year = i;
			System.out.printf("%d %.2f%n", year, futureInvestmentValue(investmentAmount, monthlyInterestRate, year));
		}
		
	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		double futureValue = 0;
		
		futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, (years*12));
		
		return futureValue;
	}
}
