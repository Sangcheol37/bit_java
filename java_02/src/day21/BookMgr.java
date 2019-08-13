package day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BookMgr extends Object implements Serializable{
	// private Book[] Booklist;
	// int cnt = 0;

	List<Book> list = null;

	public BookMgr() {
		list = new ArrayList<Book>();
		// Booklist = new Book[10];
	}

	public BookMgr(List<Book> list) {
		this.list = list;
	}

	public Boolean AddBook(Book book) {
		return list.add(book);
	}

	public List<Book> PrintBookList() {
		return list;
	}

	public boolean DeleteBLS(String title) {
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().equals(title)) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	public String FindBLS(String title) {
		
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().toUpperCase().contains(title.toUpperCase()) && (!(title.equals("")))) {
				return data.toString();
			}
		}
		return "찾으시는 도서가 없습니다.";
	}

	public void SaveFile() {
		String fileName = "book.obj";
		FileOutputStream fis = null;
		ObjectOutputStream ois = null;

		try {
			fis = new FileOutputStream(fileName);
			ois = new ObjectOutputStream(fis);
			ois.writeObject(this.list);
			ois.flush();
			/*Iterator<Book> it = list.iterator();
			while (it.hasNext()) {
				Book data = it.next();
				ois.writeObject(data+"\n");
				ois.flush();
			}*/
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (fis != null)
					fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void LoadFile() {
		String fileName = "book.obj";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		
	
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);

			this.list=(List<Book>) ois.readObject();
			Iterator<Book> it = list.iterator();
			while (it.hasNext()) {
				Book data = it.next();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
