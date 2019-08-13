package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookMgr {
	//private Book[] Booklist;
	//int cnt = 0;

	List<Book> list = null;

	public BookMgr() {
		list = new ArrayList<Book>();
		// Booklist = new Book[10];
	}

	public BookMgr(List<Book> list) {
		this.list = list;
	}

	public void AddBook(Book book) {
		list.add(book);
	}

	public void PrintBookList() {
		System.out.println("===========Book List============");
		list.forEach(i->System.out.println(i));
		System.out.println("================================");
	}

	public void DeleteBLS(String title) {
		Iterator<Book> it = list.iterator();	
		while(it.hasNext()) {
			Book data = it.next();
			if(data.getTitle().equals(title)) {
				System.out.println(data+" => 삭제됩니다.");
				it.remove();
			}
		}
	}

	public void FindBLS(String title) {
		System.out.println(title+" 검색");
		Iterator<Book> it = list.iterator();
		while(it.hasNext()) {
			Book data = it.next();
			if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				System.out.println(data);
			}
		}
		System.out.println("--------------------------------------------");
	}
}
