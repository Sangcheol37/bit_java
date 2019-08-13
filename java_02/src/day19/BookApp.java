package day19;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {

		BookMgr mgr = new BookMgr();

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

			// option = scanner.nextLine().trim();
			// scanner.nextLine();
			option = scanner.nextLine().trim();

			switch (option.trim()) { // 문자열 공백제거
			case "1":
				System.out.println();
				System.out.println("<<<<<<<<<<<<<<<도서등록>>>>>>>>>>>>>>>");
				System.out.println("Book Title 을 입력하세요");
				String title = scanner.nextLine();
				System.out.println("가격을 입력하세요");
				int price = scanner.nextInt();
				scanner.nextLine();
				mgr.AddBook(new Book(title, price));
				break;
			case "2":
				System.out.println();
				System.out.println("<<<<<<<<<<<<<<<도서삭제>>>>>>>>>>>>>>>\n");
				System.out.println("삭제할 title을 입력하세요.");
				String find = scanner.nextLine().trim();
				mgr.DeleteBLS(find);
				break;
			case "3":
				System.out.println();
				System.out.println("<<<<<<<<<<<<<<<도서검색>>>>>>>>>>>>>>>\n");
				System.out.println("검색할 도서의 이름을 입력하시면 정보를 알려드립니다 : ");
				String search = scanner.nextLine().trim();
				mgr.FindBLS(search);
				break;

			case "4":
				System.out.println();
				System.out.printf("<<<<<<<<<<도서 목록 출력>>>>>>>>>>\n");
				mgr.PrintBookList();
				break;
			case "5":
				System.out.println();
				System.out.println("<<<<<<<<<<<<<<<<시스템 종료>>>>>>>>>>>>>>>>");
				System.out.println("종료하시려면 'q/Q'를 입력하세요.");
				String quit = scanner.nextLine().trim();
				if (quit.equals("q") || quit.equals("Q")) {
					System.out.println("종료를 선택하셨습니다.");
					System.out.println("-------------종료합니다--------------");
					scanner.close();
					scanner = null;
					System.exit(0);
				}
				System.out.println("잘못 입력하셨습니다. 처음으로 돌아갑니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오.");
				break;
			}
		}
	}
}
