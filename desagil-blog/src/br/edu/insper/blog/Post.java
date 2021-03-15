package br.edu.insper.blog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private Date data;
	private String title;
	private String content;
	private List<String> tags;
	private List<Comment> comments;
	
	
	public Post(String title, String content) {
		super();
		this.data = new Date();
		this.title = title;
		this.content = content;
		this.tags = new ArrayList<String>();
		this.comments = new ArrayList<Comment>();
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getData() {
		return data;
	}


	public List<Comment> getComments() {
		return comments;
	}
	
	public boolean contains(String tag) {
		return tags.contains(tag);
	}
	
	public void addTag(String tag) {
		tags.add(tag);
	}
	
	
	
	
	
	
	

}
