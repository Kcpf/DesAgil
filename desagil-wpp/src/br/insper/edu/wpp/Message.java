package br.insper.edu.wpp;

public class Message {
	
	protected String user;
	protected String text;
	
	
	public Message(String user, String text) {
		super();
		this.user = user;
		this.text = text;
	}
	
	public String render() {
		return "<p><strong>" + this.user + ":</strong> " + this.text + "</p>";
	}
}

