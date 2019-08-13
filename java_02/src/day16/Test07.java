package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test07 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("c://lib//sample.txt")) {
			// try 구문에서 자동으로 close() 해줌. (오토클로징)
			System.out.println(" file 처리 ~~~~ ");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		System.out.println("-----------------------------------------");
		
		
		
		System.out.println(" end ");
	}

}
