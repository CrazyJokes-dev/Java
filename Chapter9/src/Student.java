
public class Student {
	String standing;
	int age;
	String name = "Unknown";
	private String grade1 = "N/A", grade2 = "N/A";
	String studentId;
	String[] classesTaken;
	
//	public Student(String name, String standing, String g1, String grade2) {
	
//	public Student() {
	
//	public void setStanding(String standing) {
		
//	public void setName(String n) {
		
//	public void setGrades(String grade1, String grade2)
		
//	public String getGrade1() {
	
//	public void greet()
		
	
	
	
	public void setClassesTaken(String[] ct) {
		classesTaken = ct;
	}
	
	public String getClassesTaken() {
		String result = "";
		for(String course : classesTaken)
			result += course + ", ";
		return result;
	}
	
	
	public static void main(String[] args) {
		
		
	}

}
