package day06;

public class Employee {
	//데이터(변수) + 기능(메소드)
		
		private String name;  //private 처리 해주었기 때문에 set get 메소드가 필요하다
		private String dept;
		private int age; 
		
		
		private boolean single;
		
		public void display() {
			System.out.printf("[나이:%-10d 이름:%10s 부서:%10s, 결혼유무:%10b]%n",getName(),this.name,this.dept,this.single);
			
			return;
		}
		
	
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}

		
		
		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}


		
		public boolean isSingle() {
			return single;
		}


		public void setSingle(boolean single) {
			this.single = single;
		}

		
		
		public void setAge(int age) {
			if(!(age>0 && age<=100)) {
				System.out.println("age(나이) 정보가 올바르지 않습니다.");
				return;
			}
			this.age=age;  //로컬변수와 변수를 구분하기위해 this 사용
			return;
		}
		
	/*		
		public void setAge(int age) { // 전부 로컬변수로 인식함
			age=age;
			return;
		}
	*/
		
		public int getAge() {  //누군가가 age 값을 알고 싶을 때 getAge 호출 
			return age;
		}

		
	


	}
