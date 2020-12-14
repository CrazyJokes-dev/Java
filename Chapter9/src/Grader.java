import java.util.Scanner;
public class Grader {
        private int score1, score2, score3;
        double averageScore;
        private char grade;
        public void readInput() {
                Scanner kbd=new Scanner(System.in);
                System.out.print("Enter 3 scores between 0 and 100 each: ");
                score1=kbd.nextInt();
                score2=kbd.nextInt();
                score3=kbd.nextInt();
        }

        //---- Write the computeAverageOfThreeScores method below.
        public void computeAverageOfThreeScores() {
        	averageScore = (double)(score1 + score2 + score3)/3;
        }

        //---- Write the computeLetterGrade method below. Scale is 90+ A, 80+ B, 70+ C, 60+ D, 59- F
        public void computeLetterGrade() {
        	if(averageScore >= 90)
        		grade = 'A';
        	else if(averageScore >= 80)
        		grade = 'B';
        	else if(averageScore >= 70)
        		grade = 'C';
        	else if(averageScore >= 60)
        		grade = 'D';
        	else
        		grade = 'F';
        }
        
        
        public void printOutput() {
                System.out.printf("Average of %d, %d, %d is %.2f\nLetter grade for %.2f is %s",
                        score1, score2, score3, averageScore, averageScore, grade);
        }

        public static void main (String args[]) {
                Grader g = new Grader();
                g.readInput();
                g.computeAverageOfThreeScores();
                g.computeLetterGrade();
                g.printOutput();
        }
}