package day03_ex;

public class Book {
	private String title;
	private int price;
	int size;
	
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

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public void print() {
		System.out.printf("Book[%s : %7d] %n",title,price);
	}
}
