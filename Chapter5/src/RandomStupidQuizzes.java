import java.util.Scanner;

public class RandomStupidQuizzes {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = 0;
		
		while(n >= 0) {
			n = stdin.nextInt();
			
			if (n > 100)
				System.out.print(n + " ");
			
		}

	}

}
