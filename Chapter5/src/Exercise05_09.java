import java.util.Scanner;
public class Exercise05_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String stuName = "Unknown";
		int stuScore = 0;
		
		String nameTop1 = "Unknown";
		double scoreTop1 = 1;
		String nameTop2 = "Unknown";
		double scoreTop2 = 0;
		
		System.out.print("Enter the number of Students: ");
		int i = input.nextInt();
		
		for(int n = 1; n <= i; n++) {
			System.out.print("Enter a student name: ");
			stuName = input.next();
			System.out.print("Enter the student's score: ");
			stuScore = input.nextInt();
			
			if (stuScore > scoreTop1) {
				scoreTop2 = scoreTop1;
				nameTop2 = nameTop1;
				scoreTop1 = stuScore;
				nameTop1 = stuName;
			} else if(stuScore < scoreTop1 && stuScore > scoreTop2) {
				scoreTop2 = stuScore;
				nameTop2 = stuName;
			}	
		}
		
		System.out.println("Top 2 students: ");
		System.out.println(nameTop1 + "\'s score is " + scoreTop1);
		System.out.println(nameTop2 + "\'s score is " + scoreTop2);
		
	}

}
