package day03_ex;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		String option;
		while (true) {
			System.out.println("");
			System.out.println("*******    명령   선택      *******");
			System.out.println("1. insert(등록) \n");
			System.out.println("2. delete(삭제) \n");
			System.out.println("3. update(수정) \n");
			System.out.println("4. quit(종료) \n");
			System.out.println("*****************************\n\n");
			System.out.println("수행할 명령을 선택하세요!");
			System.out.print("1 2 3 4 중 하나를 선택하세요.._");

			//option = scanner.nextLine().trim();
			//scanner.nextLine();
			option=scanner.nextLine().trim();
			
			switch (option.trim()) {  //문자열 공백제거
			case "1":
				System.out.println("insert 작업을 수행하는 기능 호출.");
				break;
			case "2":
				System.out.println("delete 작업을 수행하는 기능 호출.");
				break;
			case "3":
				System.out.println("update 작업을 수행하는 기능 호출.");
				break;
			case "4":
				System.out.println("정말 종료하려면 q/Q 를 입력하세요.");
				String quit = scanner.nextLine().trim();
				if (quit.equals("q") || quit.equals("Q")) {
					System.out.println("종료를 선택하셨습니다.");
					System.out.println("-------------종료합니다--------------");
					scanner.close();
					scanner=null;
					System.exit(0);
				}
				System.out.println("처음으로 돌아갑니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오.");
				break;
			}
		}
	}
}
