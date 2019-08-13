package day10;

public class School {

	public static void main(String[] args) {
		
		Student st = new Student("홍길동",20,200201);
		Teacher tc = new Teacher("이순신",30,"JAVA");
		Employee emp = new Employee("유관순",40,"교무과");
		
		st.print();
		tc.print();
		emp.print();
		
		/*
		 * Person[] s = {
		 * Student st = new Student("홍길동",20,200201)
		  Teacher tc = new Teacher("이순신",30,"JAVA")
		  Employee emp = new Employee("유관순",40,"교무과")
		  };
		  
		  
		  for(Person data : s){
		  if(data instanceof Employee)((Employee)data).print();
		  if(data instanceof Student)((Student)data).print();
		  if(data instanceof Teacher)((Teacher)data).print();
		  ((Teacher)data).toString();
		  
		  
		  
		  //instanceof Employee : Employee 타입일때만 캐스팅
		  //오버라이딩 하면 for 문장 사라질 수 있음
		  
		  for(Person data:s){
		  	data.print();
		  };
		   
		   
		   
		 */
	
	
	}

}
