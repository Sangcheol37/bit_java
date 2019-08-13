package day21;

import java.io.Serializable;

public class Book extends Object implements Comparable<Book> ,Serializable{
	private String title;
	private int price;
	private int isbn;

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public Book() {}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	

	public Book(int isbn, String title, int price) {
		super();
		this.title = title;
		this.price = price;
		this.isbn = isbn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn != other.isbn)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", isbn=" + isbn + "]";
	}

	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
}
