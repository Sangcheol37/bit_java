package day07;


/**
 * 
 * @author ksc
 *
 */
public class Employee {
	
	private String name;
	private String dept;
	private boolean single;
	
	public Employee() {
		//초기화 작업을 주로 한다.
		System.out.println("Employee() call");
		name = "사원이름";
		dept = "ooo 부서";
		single = true;
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
	/**
	 * 
	 * @param single 결혼유무
	 */
	public void setSingle(boolean single) {
		this.single = single;
	}
	/**
	 * Employee 정보 출력
	 */
	public void print() {
		System.out.printf("[사원명:%5s , 근무부서:%5s , single: %5b]\n",getName(),getDept(),isSingle());
	}
	
	
}
