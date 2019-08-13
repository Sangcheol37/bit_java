 package day06;

public class Test03 {
	public static void main(String[] args) {

		// 객체생성 = 인스턴스생성
		// int num;
		// String name;
 
		//this 라는 키워드는 heap 영역에서만 사용가능. stack 영역에서는 사용불가
		
		Employee emp1 = new Employee(); // 객체생성 이라고 합니다. //new Employee 이부분을 '오브젝트 (인스턴스)' 라고함
		
		emp1.display();		
		
		Employee emp2 = new Employee();
		emp2.setName("홍길동");
		emp2.setAge(31);
		emp2.setDept("인사부");
		emp2.setSingle(false);
		emp2.display();
		
		Employee emp3 = new Employee();
		emp3.setName("박길동");
		emp3.setAge(26);
		emp3.setDept("영업부");
		emp3.setSingle(true);
		emp3.display();
		
		
		
	
	}
}
