package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test05 {
	public static void main(String[] args) {
		System.out.println(" main start ");
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("c://lib//sample.txt");
			// 파일 IO는 절대위치를 기준으로 잡아주는게 가장 좋다.
			System.out.println("파일 준비 완료");

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("sample.txt 파일을 준비해주세요");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			// 자원반납
			try {
				if (fis != null) {
					fis.close();
					fis=null;
					System.out.println("자원 반납 완료");
					// sample.txt를 찾지 못하면 객체생성을 하지 못하고 (fis에 주소가 들어가지 않음)
					// 이 부분으로 오게 된다.
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" main end ");
	}
}
