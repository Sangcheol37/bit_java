package day03_ex;


public class BookTest {
	public static void main(String[] args) {
		
		BookMgr mgr = new BookMgr(5);
		
	
//		for(Book data : mgr.getBooklist())
//		{
//			System.out.println(data);
//		}

		mgr.AddBook(new Book("Java Program", 8000));
		mgr.AddBook(new Book("JSP Program", 10000));
		mgr.AddBook(new Book("SQL Fundamentals", 12000));
		mgr.AddBook(new Book("JDBC Program", 9500));
		mgr.AddBook(new Book("EJB Program", 10000));
		mgr.AddBook(new Book("ORACLE Program", 10000));
		

	
		System.out.println("=== 책 목록 ===");
		mgr.PrintBookList();
		System.out.printf("\n\n");
		System.out.println("=== 책 가격의 총합 ===");
		mgr.PrintTotalPrice();
	}

}
/*
class BookMgr {
	Book[] Booklist;
	int cnt;

	public BookMgr() {
		Booklist = new Book[10];
	}

	
	public void AddBook(Book book) {
		 
		Booklist[cnt]=book;
		cnt++;
	}

	public void PrintBookList() {
		for (int i = 0; i < cnt; i++) {
			System.out.println(Booklist[i].getTitle());
		}
	}

	public void PrintTotalPrice() {
		int sum = 0;
		for (int i = 0; i < cnt; i++) {
			sum+=Booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합 : "+sum);
	}
}
*/
/*
class Book {
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
 */
