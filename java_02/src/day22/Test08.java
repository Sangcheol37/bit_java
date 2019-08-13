package day22;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Test08 {

	public static void main(String[] args) {
		String src = "c://lib//dbinfo.txt";
		FileReader fr = null;
		Properties prop = new Properties();
		
		
		try {
			fr = new FileReader(src);
			prop.load(fr);

			String id = prop.getProperty("user");
			String pw = prop.getProperty("pw");

			System.out.println("로그인 시도 " + id + " / " + pw);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}

}
