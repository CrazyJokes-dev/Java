package problem3;

public class BlogEntry {
	public String pUsername;
	private double pAge;
	private String pText;

	
	public BlogEntry(String pUsername, double pAge, String pText) {
		this.pUsername = pUsername;
		this.pAge = pAge;
		this.pText = pText;
	}
	
	public void setUsername(String pUsername) {
		this.pUsername = pUsername;
	}
	
	public void setAge(double seconds) {
		pAge = seconds;
	}
	
	public void setText(String pText) {
		this.pText = pText;
	}
	
	String convertToTime() {
		double sec = pAge;
		if(sec >= 60) {
			int minutes = (int) (sec / 60);
			sec -= (int)(minutes*60);
			
			int hours = (int) (minutes / 60);
			minutes -= (hours*60);
					
			return "hours: " +hours+ "   minutes: " +minutes+ "   seconds: " + sec;
		} else {
			return "hours: 0   minutes: 0   seconds: " + sec;
		}
		
		
		
	}
	
	public void DisplayEntry() {
		System.out.println("Username: " +pUsername);
		System.out.println("\nAge: " +convertToTime());
		System.out.println("Text: " +pText);
		
	}
	
	public void getSummary() {
		String[] sumArr = pText.split(" ");
		System.out.print("\nSummary: ");
		for(int i = 0; i<sumArr.length; i++) {
			if(sumArr[i] != null) {
				if(i == 9)
					System.out.print(sumArr[i] + "...");
				else if(i < 9)
					System.out.print(sumArr[i] + " ");
			}
				
			
		}
	}
	
	public static void main(String[] args) {
		BlogEntry poster = new BlogEntry("CrazyJokes", 87, "the music in those memes are pretty epic tho something some e e e e e");
		
		
		poster.DisplayEntry();
		poster.getSummary();
		
		
	}

}
