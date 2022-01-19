
public class File extends Document{
	private String pathname;
	
	public File() {
		super();
		pathname = "";
	}
	
	public File(String path, String text) {
		super(text);
		pathname = path;
	}
	
	public void setPathname(String pathname) {
		this.pathname = pathname;
	}
	
	public String getPathname() {
		return pathname;
	}
	
	public String toString() {
		return "Pathname: " +pathname+ "\nFile contents: " +super.toString();
	}

}
