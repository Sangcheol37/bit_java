package day09;


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
		// Booklist = new Book[10];
	}

	public BookMgr(int size) {
		Booklist = new Book[10];
	}

	public void AddBook(Book book) {
		if (cnt == Booklist.length) {
			Book[] copy = new Book[Booklist.length * 2];
			System.arraycopy(book, 0, copy, 0, Booklist.length);
			Booklist = copy;
		}
		Booklist[cnt] = book;
		cnt++;
	}

	public void PrintBookList() {
		System.out.println("==================Book List==================");
		for (int i = 0; i < cnt; i++) {
			System.out.printf("Book : %-10s  Price : %5d%n", Booklist[i].getTitle(), Booklist[i].getPrice());
		}
		System.out.println("총 " + cnt + "권");
		System.out.println("=============================================");
	}

	public void DeleteBLS(String title) {
		for(int i=0;i<cnt;i++) {
			if(Booklist[i].getTitle().equals(title)) {
				System.arraycopy(Booklist, i+1, Booklist, i, cnt-i-1);
				cnt--;
				System.out.println(title+"삭제 되었습니다.");
				return;
			}
		}
		System.out.println(title+" 도서가 없습니다.");		
	}

	public void FindBLS(String title) {
		for (Book data:Booklist) {
			if(data == null) return;
			if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				data.print();
			}
		}
	}
}
