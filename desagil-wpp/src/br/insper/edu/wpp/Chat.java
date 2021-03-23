package br.insper.edu.wpp;

import java.util.ArrayList;
import java.util.List;

public class Chat {
	
	private List<Message> messages;

	public Chat() {
		super();
		this.messages = new ArrayList<Message>();
	}
	
	private void post(Message msg) {
		this.messages.add(msg);
	}

}
