package br.edu.insper.desagil.blarg;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class BlogTest {
	
	@Test
	public void adicionaDoisPosts() {
		Blog blog = new Blog("Esporte Interativo");
		String title = "Venha para o restaurante";
		String content = "asdadsadasdsadasd";
		List<String> tags = new ArrayList<>();
		tags.add("comida");
		tags.add("mcdonalds");
		
		blog.addPost(title, content, tags);
		
		String title2 = "Venha para o restaurante 2";
		String content2 = "asdadsadasdsadasd2";
		List<String> tags2 = new ArrayList<>();
		tags2.add("comida");
		tags2.add("burgerking");
		
		blog.addPost(title2, content2, tags2);
		
		Map<String, List<Post>> dict = blog.getPostsPerTag();
		
		assertEquals(dict.size(), 3);
		assertEquals(dict.get("comida").size(), 2);
		assertEquals(dict.get("mcdonalds").size(), 1);
		assertEquals(dict.get("burgerking").size(), 1);
		
		
	}
}
