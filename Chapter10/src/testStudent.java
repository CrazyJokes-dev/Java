class Student {
    private int score;
    public Student (int score) {this.score += score;}
    public Student (int score, int bonus) {score=score+bonus; this.score=score;}
    public Student () {score=100;}
    public int getScore() {return score;}
}

public class testStudent {
    public static void main (String args[]) {
        Student s1 = new Student();
        Student s2 = new Student(80);
        Student s3 = new Student (80, 10);
        System.out.println(s1.getScore());
        System.out.println(s2.getScore());
        System.out.print(s3.getScore());
    }
}