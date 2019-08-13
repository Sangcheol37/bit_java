package day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class BookMgr2 {
	//private Book[] Booklist;
	//int cnt = 0;

	Map<Integer,Book> map = null;

	public BookMgr2() {
		map = new HashMap<Integer,Book>();
		// Booklist = new Book[10];
	}

	public BookMgr2(HashMap<Integer,Book> map) {
		this.map = map;
	}

	public void AddBook(Book book) {
		map.put(book.getIsbn(),book);
	}

	public void PrintBookList() {
		//map 에서의 forEach
		System.out.println("===========Book List forEach 기반============");
		map.forEach ((k,v) ->	System.out.println(k +" : " +v));	
		System.out.println("============================================");
	}

	public void DeleteBLS(String title) {
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer isbn = it.next();
			Book data = map.get(isbn);
			if(data.getTitle().equals(title)) {
				System.out.println(data+"삭제 됩니다.");
				it.remove();
			}
		}
	}

	public void FindBLS(String title) {
		System.out.printf("제목  : %s%n검색결과 : %n ",title);
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			Integer isbn = it.next();
			Book data = map.get(isbn);
			if(data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				System.out.println(data);
			}
		}
		System.out.println("--------------------------------------------");
	}
}
