package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookMgr1 {

	List<Book1> book = new ArrayList<Book1>();
	// int cnt=0;

	// 도서등록 기능
	public void AddBook(String name, int price) {
		book.add(new Book1(name, price));
	}

	// 도서삭제 기능
	public void DeleteBLS(String name) {
		Iterator<Book1> it = book.iterator();
		while (it.hasNext()) {
			Book1 data = it.next();
			if (data.getName().equals(name)) {
				System.out.println(data +" => 삭제됩니다.");
				it.remove();
			}
		}
	}

	// 도서목록출력 기능
	public void PrintBookList() {
		if (book.size() == 0) {
			System.out.println("등록된 도서가 없습니다.");
		} else {
			book.forEach(System.out::println);
		}
	}

	// 도서 검색 기능
	public void FindBLS(String title) {
		if (book.size() == 0) {
			System.out.println("등록된 도서가 없습니다.");
		} else {
			Iterator<Book1> it = book.iterator();
			while (it.hasNext()) {
				Book1 data = it.next();
				if (data.getName().toUpperCase().contains(title.toUpperCase())) {
					System.out.println(data);
					return;
				}
			}
			System.out.println("찾으시는 도서가 없습니다.");
		}
	}

	// 종료기능을 추가
}