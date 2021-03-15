package br.edu.insper.blog;

import java.util.Date;

public class Comment {
	
	private Date date;
	private String author;
	private String content;
	
	
	public Comment(String author, String content) {
		super();
		this.date = new Date();
		this.author = author;
		this.content = content;
	}

	public Date getDate() {
		return date;
	}


	public String getAuthor() {
		return author;
	}


	public String getContent() {
		return content;
	}
	
}
