package br.insper.edu.wpp;

public class MediaMessage extends Message {
	
	private String src;

	
	public MediaMessage(String user, String text, String src) {
		super(user, text);
		this.src = src;
	}
	
	@Override
	public String render() {
		return "<figure><p><strong>" + this.user + ":</strong> " + this.text + "</p><img src='" + this.src
				+ "'></figure>";
	}

}
