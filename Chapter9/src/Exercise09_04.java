import java.util.Random;

public class Exercise09_04 {
	
    public static void main(String[] args) {
        Random randNum = new Random(1000);

        for (int i = 0; i < 50; i++) {
            System.out.println(randNum.nextInt(100));
        }
    }
}