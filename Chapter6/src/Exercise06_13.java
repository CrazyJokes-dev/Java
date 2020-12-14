
public class Exercise06_13 {

	public static void main(String[] args) {
		
		System.out.printf("%-4s %20s\n", "i", "m(i)");
		

		for(int i = 1; i<=20; i++) {
			System.out.printf("%-4d %20.4f\n", i, computeSumSeries(i));
		}
	}
	
	public static double computeSumSeries(int numGoal) {
		double total = 0;
		
		for(double i = 1; i<=numGoal; i++) {
			total += i/(i+1.0);
		}
		
		return total;
	}
}
