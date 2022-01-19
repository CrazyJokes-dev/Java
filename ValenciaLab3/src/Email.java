
public class Email extends Document {
	private String sender;
	private String recipient;
	private String title;
	
	public Email() {
		super();
		sender = "";
		recipient = "";
		title = "";
	}
	
	public Email(String sender, String recipient, String title, String text) {
		super(text);
		this.sender = sender;
		this.recipient = recipient;
		this.title = title;
	}
	
	public void setSender(String sender) {
		this.sender = sender;
	}
	
	public String getSender() {
		return sender;
	}
	
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	
	public String getRecipient() {
		return recipient;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return "Sender: " +sender+ "\nRecipient: " +recipient+ "\nTitle: " +title+ "\nmessage: " +super.toString();
	}

}
