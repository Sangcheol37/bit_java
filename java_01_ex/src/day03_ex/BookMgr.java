package day03_ex;

public class BookMgr {
	Book[] Booklist;
	int cnt = 0;

	public Book[] getBooklist() {
		return Booklist;
	}

	public void setBooklist(Book[] booklist) {
		Booklist = booklist;
	}

	public BookMgr() {
		this(10);
		//Booklist = new Book[10];
	}

	public BookMgr(int size) {
		Booklist = new Book[10];
	}

	
	public void AddBook(Book book) {
		if(cnt == Booklist.length) {
			Book[] copy = new Book[Booklist.length*2];
			System.arraycopy(book, 0, copy, 0, Booklist.length);
			Booklist = copy;
		}
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
