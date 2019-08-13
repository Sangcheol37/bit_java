package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test06_CommandMap {
	public static void main(String[] args) {
		Map <String, Command> map = new HashMap<String, Command>();
		
		//InsertCommand ic = new InsertCommand();
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("insert/update/select/delete/new 중 하나를 입력 하시오.");
		String cmd = scanner.nextLine();
		
		map.put("insert", new InsertCommand());
		map.put("update", new UpdateCommand());
		map.put("select", new SelectCommand());
		map.put("delete", new DeleteCommand());
		map.put("new"   , new Command(){
			//Command() 생성자가 없지만 익명 내부 클래스로 수행. 익명 클래스는 재활용 할 수 없다.
			@Override
			public void exec() {
				System.out.println(" 기능 추가 ");
			}
		});
		//map구조로 가지 않더라도 가장 간단하게 Command[] 에 생성자 때려박아서 생성가능;
		
		/*
		map.get(cmd).exec();
		
		if(map.get(cmd)!=null) {
			map.get(cmd).exec();
		}
		else
		{
			System.out.println("잘못입력");
		}*/
		
		//이게 안되는 이유 : map.get(cmd) 를 하면 value 인 Command의 주소를 가져온다. 
		//exec() 메소드를 사용하기 위해선 Command 객체가 있어야하는데 
		//map.get(cmd).exec();  => 이것은 Command 객체가 아니기 때문에 사용할 수 없다.
		
		Command command = map.get(cmd);
		if(command != null) {
			command.exec();
		}
		else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		//유효성 검사 반드시 넣어주어야함.	
	}
}
