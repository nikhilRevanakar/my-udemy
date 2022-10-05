package com.designpattern.factoryMethod;

public class PostFactory {

	public static Posts getPostObject(String type) {
		switch(type) {
		case "news":
			return new NewsPost();
		case "blog":
			return new BlogPost();
		default:
			throw new IllegalArgumentException();
		}
	}
}
