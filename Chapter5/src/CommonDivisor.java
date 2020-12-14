
public class CommonDivisor {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		
		int gcd = 1;
		for(int i=2; i<=Math.min(x, y); i++) {
			if(x % i == 0 && y % i == 0)
				gcd = i;
		}
		
		System.out.println(3*3*3);
	}

}
