package problem1;

public class Fraction {
	private int numerator = 1;
	private int demoninator = 1;
	
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDemoninator() {
		return demoninator;
	}

	public void setDemoninator(int demoninator) {
		this.demoninator = demoninator;
	}
	
	public double divideFraction() {
		return (double)numerator/demoninator;
	}
	
	public String simplifiedForm()  {
		int arrPlacement = 0;
		int[] factorNum = new int[numerator];
		int[] factorDem = new int[demoninator];
		
		for(int i = 1; i<=factorNum.length; i++) {
			if(numerator%i == 0) {
				factorNum[arrPlacement] = i;
				arrPlacement++;
			}
		}
		arrPlacement = 0; 
		
		for(int i = 1; i<=factorDem.length; i++) {
			if(demoninator%i == 0) {
				factorDem[arrPlacement] = i;
				arrPlacement++;
			}
		}
		
		//Now that we have the arrays, we can now look for the highest common factor between them
		int HCF = 1;
		
		for(int i = 0; i<factorNum.length; i++) {
			for(int k = 0; k<factorDem.length; k++) {
				if(factorNum[i] == factorDem[k] && factorNum[i] > HCF) {
					HCF = factorNum[i];
				}
			}
		}
		
		
		
		
		return numerator/HCF + "/" + demoninator/HCF;
	}

	public static void main(String[] args) {
		Fraction frac = new Fraction();
		
		frac.setNumerator(40);
		frac.setDemoninator(60);
		
		System.out.println(frac.simplifiedForm());
		
	}

}
