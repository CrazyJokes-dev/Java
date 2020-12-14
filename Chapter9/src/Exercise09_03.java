import java.util.Date;

public class Exercise09_03 {
	
	public static void main(String[] args) {
		Date dateTime = new Date();
		
		long[] arrOfNums = {10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L};    
		
		
		for(int i = 0; i<arrOfNums.length; i++) {
			
			dateTime.setTime(arrOfNums[i]);
			System.out.println(dateTime.toString());
		}
	}

}