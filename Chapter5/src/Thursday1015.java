
public class Thursday1015 {

	public static void main(String[] args) {
		double x, y;
		int numOfDotsInCircle = 0;
		int totalDots = 100000;
		
		for (int i = 0; i < 100000; i++) {
			x = Math.random() * 2 - 1;
			y = Math.random() * 2 - 1;
			//System.out.println(x +" "+ y);
			if(x * x + y * y <= 1)
				numOfDotsInCircle++;
		}
		
		double pi = 4.0 * numOfDotsInCircle / totalDots;
		System.out.println("PI=" + pi);
	}

}
