package problem1;

public class Driver {

	public static void main(String[] args) {
		Fraction frac = new Fraction();
		
		frac.setNumerator(123);
		frac.setDemoninator(328);
		
		System.out.println(frac.divideFraction());
		System.out.println(frac.simplifiedForm());
		
		
		
		
	}

}
