package br.edu.insper.blog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Blog {
	
	private String name;
	private List<String> tags;
	private List<Post> posts;
	
	
	public Blog(String name) {
		super();
		this.name = name;
		this.tags = new ArrayList<String>();
		this.posts = new ArrayList<Post>();
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getTags() {
		return tags;
	}


	public List<Post> getPosts() {
		return posts;
	}
	
	public void addPost(String title, String content, List<String> tagList) {
		Post newPost = new Post(title, content);
		
		for (String tag : tagList) {
			newPost.addTag(tag);
			if (!tags.contains(tag)) tags.add(tag);
		}
		
		posts.add(newPost);
		
	}
	
	public Map<String, List<Post>> getPostsPerTag() {
		Map<String, List<Post>> dic = new HashMap<String, List<Post>>();
		
		for (String tag : tags) {
			for (Post post : posts) {
				if (!dic.containsKey(tag)) dic.put(tag, new ArrayList<Post>());
				if (post.contains(tag)) dic.get(tag).add(post);
			}
		}
		
		return dic;
	}
	
	
	
	
}
