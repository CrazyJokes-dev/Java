package problem3;

public class Driver {

	public static void main(String[] args) {
		BlogEntry blog = new BlogEntry ("CrazyJokes", 87, "the music in those memes are pretty epic tho");
		
		blog.DisplayEntry();
		blog.getSummary();
		
		System.out.print(blog.pUsername);

	}

}
