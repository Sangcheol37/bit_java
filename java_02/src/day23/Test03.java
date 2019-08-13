package day23;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {

		String fileName = "data.obj";
		FileOutputStream fis = null;
		ObjectOutputStream ois = null;

		try {
			fis = new FileOutputStream(fileName);
			ois = new ObjectOutputStream(fis);
			
			String name = "홍길동";
			Date d = new Date();
			ois.writeObject(name);
			ois.flush();
			ois.writeObject(d);
			ois.flush();
			System.out.println(" 파일에 저장되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(ois!=null)ois.close();
				if(fis!=null)fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}