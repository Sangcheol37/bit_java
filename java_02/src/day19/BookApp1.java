package day19;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookApp1 {

	public static void main(String[] args) {

		BookMgr1 bgr = new BookMgr1();

		Scanner scanner = new Scanner(System.in);
		String option;
		while (true) {
			System.out.println("");
			System.out.println("*******    Book Manager   *******\n");
			System.out.println("1. 도서 등록 \n");
			System.out.println("2. 도서 삭제 \n");
			System.out.println("3. 도서 검색 \n");
			System.out.println("4. 도서 목록 출력 \n");
			System.out.println("5. quit(종료) \n");
			System.out.println("*********************************\n\n");
			System.out.print("실행할 명령을 선택하십시오. ex)1 .._");

			option = scanner.nextLine().trim();

			switch (option.trim()) { // 문자열 공백제거
			// 등록
			case "1":
				int price = 0;
				System.out.println("제목을 입력하세요");
				String title = scanner.nextLine().trim();
				System.out.println("가격을 입력하세요");
				while (true) {
					try {
						price = scanner.nextInt();
						break;
					} catch (InputMismatchException e) {
						scanner=new Scanner(System.in);
						System.out.println("정수만 입력할 수 있습니다. 다시 입력하세요 : ");
					}
				}
				bgr.AddBook(title, price);
				break;
			// 삭제
			case "2":
				System.out.println("삭제할 도서의 제목을 입력하세요 :");
				title = scanner.nextLine().trim();
				bgr.DeleteBLS(title);
				break;
			// 검색
			case "3":
				System.out.println("검색하실 도서의 제목을 입력하세요 :");
				title = scanner.nextLine().trim();
				bgr.FindBLS(title);
				break;
			// 목록출력
			case "4":
				bgr.PrintBookList();
				break;
			// 종룍
			case "5":
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
