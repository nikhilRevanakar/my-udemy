package com.designpattern.factoryMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Posts post = PostFactory.getPostObject("blog");
		
		post.displayPosts();
	}

}
