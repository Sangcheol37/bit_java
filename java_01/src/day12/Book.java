package day12;

public class Book {
	private String title;
	private int price;
	
	public Book() {}
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
	public Book(int price, String title) {
		super();
		this.title = title;
		this.price = price;
	}
	
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
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Book 정보 / title :");
		sb.append(title);
		sb.append(" , 가격 :");
		sb.append(price);
		
		//return sb.toString(sb);
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(obj == null || !(obj instanceof Book)) {
			return false;
		}
		
		Book b = (Book) obj;
		if(title.equals(b.title) && price==b.price) {
			flag = true;;
		}	
		return flag;	
	}
	
	@Override
	protected void finalize() throws Throwable {
		//객체가 소멸되기직전에 호출되는 메소드 이지만 자바에서는 사용안하고 별도의 자원반납 기능을 만들어 사용한다.
		System.out.println("자원반납코드");
	}
	
	public void clsoe() {
		System.out.println("자원반납코드");
	}
	
}
