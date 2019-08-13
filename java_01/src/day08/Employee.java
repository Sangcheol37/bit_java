package day08;


/**
 * 
 * @author ksc
 *
 */
public class Employee {
	
	static String cName="BIT";
	private String name;
	private String dept;
	private boolean single;
	
	
	//default 생성자 (기본 생성자)
	public Employee() {
		//초기화 작업을 주로 한다.
		//System.out.println("Employee() call");
		//name = "사원이름";
		//dept = "ooo 부서";
		//single = true;
		this("사원이름","ooo 부서",true);
	}
	
	public Employee(String name, String dept, Boolean single) {
		//System.out.printf("\nEmployee(%s,%s,%s) call\n",name,dept,single);
		this.name = name;
		this.dept = dept;
		this.single = single;
	}
	
	public Employee(String name, String dept) {
		//System.out.printf("\nEmployee(%s,%s) call\n",name,dept);
		//this.name = name;
		//this.dept = dept;

		this(name,dept,false);
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
	//	System.out.println("회사명 :"+cName);
		System.out.printf("[사원명:%5s , 근무부서:%5s , single: %5b]\n",this.getName(),getDept(),single);
	}
	
	
}
