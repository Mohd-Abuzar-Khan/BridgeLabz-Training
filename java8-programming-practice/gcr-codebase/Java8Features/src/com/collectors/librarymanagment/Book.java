package com.collectors.librarymanagment;

public class Book {

	String name;
	String genres;
	int page;

	public Book(String name, String genres, int page) {
		super();
		this.name = name;
		this.genres = genres;
		this.page = page;
	}

	@Override
	public String toString() {
		return "Book [name= " + name + ", genres= " + genres + ", page= " + page + "]";
	}

	public String getGenres() {
		return genres;
	}

	public Integer getPage() {
		return page;
	}
}