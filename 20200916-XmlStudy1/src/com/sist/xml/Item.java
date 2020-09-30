package com.sist.xml;

/*
	1. 태그안에 태그가 있으면 => 클래스 제작임
	2. 태그 안에 값이나 문자열이 있으면 =>  변수 제작해야함
	
	위 두가지 사항을 선행해야만 자바와 xml연결이 가능하다.
 */

public class Item {
	private String title;
	private String description;
	private String author;
	private String link;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}

}
