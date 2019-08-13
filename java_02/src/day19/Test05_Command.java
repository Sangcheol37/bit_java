package day19;

import java.util.Scanner;

public class Test05_Command {
	public static void main(String[] args) {
		Command delete = new DeleteCommand();
		Command update = new UpdateCommand();
		Command insert = new InsertCommand();
		Command select = new SelectCommand();

		Scanner scanner = new Scanner(System.in);
		System.out.println("insert/update/select/delete 중 수행할 연산 입력 하시오.");
		String cmd = scanner.nextLine();
		//String cmd = args[2]; 
		
		//run configuration 에서 arguments에 insert update... 입력하면 이클립스에서 실행가능
		//dos창에서 실행하려면  E:work:workplace..... java day19.Test05_Command insert
		//이런식으로 실행하면 된다.

		switch (cmd) {
		case "insert":
			insert.exec();
			break;
		case "update":
			update.exec();
			break;
		case "select":
			select.exec();
			break;
		case "delete":
			delete.exec();
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			break;
		}
	}
}
