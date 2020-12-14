import java.util.Scanner;
public class CaseStudy2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = 0;
		int numBefore = 0;
		int numDuplicate = 0;
		
		while(n >= 0) {
			numBefore = n;
			n = stdin.nextInt();
			
			if(numBefore == n)
				numDuplicate++;
			
			
		}
		System.out.print(numDuplicate);
	}

}
