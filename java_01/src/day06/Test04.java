package day06;

public class Test04 {
	public static void main(String[] args) {

		Employee emp1 = new Employee();
		
		Employee emp2 = new Employee();
		emp2.setName("홍길동");
		emp2.setAge(31);
		emp2.setDept("인사부");
		emp2.setSingle(false);

		Employee emp3 = new Employee();
		emp3.setName("박길동");
		emp3.setAge(26);
		emp3.setDept("영업부");
		emp3.setSingle(true);

		Employee emp4 = new Employee();
		emp4.setName("주길동");
		emp4.setAge(28);
		emp4.setDept("영업부");
		emp4.setSingle(true);

		Employee[] emp = { emp1, emp2, emp3, emp4 };

		System.out.println("== 영업부에 근무하는 사원 목록 == ");
		double sum = 0;
		int count = 0;
		for (Employee data : emp) {
			// System.out.println(data.getDept());
			if(data.getDept() != null && (data.getDept().equals("영업부"))) {
				sum+=data.getAge();
				count++;
				data.display();
			}
		}
		System.out.printf("영업부 평균급여: %.2f%n",sum/count);
		System.out.printf("%n== 영업부에 근무하는 사원 목록 == %n%n");
		
		
		System.out.println("== 싱글인 사원 목록 == ");  
		for (int i = 0; i < emp.length; i++) {
			//System.out.println(emp[i].isSingle());
			if(emp[i].isSingle()) {
				emp[i].display();
			}
		}
		System.out.println("== 싱글인 사원 목록 == ");

	}

}