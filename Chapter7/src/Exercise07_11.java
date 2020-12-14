import java.util.Scanner;
public class Exercise07_11 {

	public static double deviation(double[] x) {
		double total = 0;
		int i;
		for(i = 0; i<x.length; i++) {
			total += x[i];
		}
		double mean = total/(double)x.length;
		
		// Now let's get the deviation //
		double series = 0;
		for(int k = 0; k<x.length; k++) {
			double insidePar = (x[k] - mean);
			series += Math.pow(insidePar, 2.0);
		}
		double insideSQRT = series/(x.length - 1);
		
		double stdDeviation = Math.sqrt(insideSQRT);
		
		return stdDeviation;
	}
	
	public static double mean(double[] x) {
		double total = 0;
		int i;
		for(i = 0; i<x.length; i++) {
			total += x[i];
		}
		double mean = total/(double)x.length;
		
		return mean;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ten numbers: ");
		double[] numsChosen = new double[10];
		double num;
		int counter = 0;
		do {
			num = input.nextDouble();
			numsChosen[counter] = num;
			
			counter++;
		}while(counter < 10);
		
		// Main Script //
		
		System.out.println("the mean is " +mean(numsChosen));
		System.out.println("The standard deviation is " + deviation(numsChosen));
	}

}
