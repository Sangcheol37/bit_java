package day06;

public class Test02 {
	public static void main(String[] args) {

		// 객체생성 = 인스턴스생성
		// int num;
		// String name;
 
		Employee emp1 = new Employee(); // 객체생성 이라고 합니다. //new Employee 이부분을 '오브젝트 (인스턴스)' 라고함
		//System.out.println(emp1.age+":"+emp1.name+":"+emp1.dept);
		
		
		Employee emp2 = new Employee();
		//emp2.age = 201901;
		//emp2.name = "홍길동";
		//emp2.dept = "인사부";
		//System.out.println(emp2.age+":"+emp2.name+":"+emp2.dept);

		Employee emp3 = new Employee();
		//emp3.age = 201902;
		//emp3.name = "박길동";
		//emp3.dept = "영업부";
		//System.out.println(emp3.age+":"+emp3.name+":"+emp3.dept);
			
		emp1.display();
		emp2.display();
		emp3.display();
	

	}
}
