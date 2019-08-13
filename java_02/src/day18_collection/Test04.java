package day18_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test04 {
	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>();
		boolean flag  = set.add(new Employee(2017001,"홍씨","영업"));
		if(flag) System.out.println("등록되었습니다. ");
		
		flag = set.add(new Employee(2017001,"홍씨","영업"));
		if(!flag) System.out.println("이미 존재하는 데이터입니다. ");
		
		set.add(new Employee(2017044,"김씨","인사"));
		set.add(new Employee(2017001,"박씨","영업"));
		set.add(new Employee(2017001,"홍씨","영업")); 
		set.add(new Employee(2017003,"이씨","기술"));
		
		//set 목록 출력
		Iterator<Employee> it = set.iterator();
		System.out.println("사원목록입니다. ");
		while (it.hasNext()) {
			Employee data = it.next();
			System.out.println(data);
			}
		
		System.out.println();
		
		//2017003 사번의 사원을 검색출력하세요.
		System.out.println("검색결과입니다. ");
		it=set.iterator();
		while (it.hasNext()) {
		Employee data = it.next();
			if(data.number == 2017003) {
				System.out.println(data);
		}
		}
	}
		
}



class Employee implements Comparable<Employee>{ //sort 하기 위한 조건  //TreeSet은 자동으로 sort되서 나옴 
	int number;
	String name;
	String dept;
	
	
	public int getNumber() { 
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	public Employee(int number, String name, String dept) {
		super();
		this.number = number;
		this.name = name;
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (number != other.number)
			return false;
		return true;
	}
	@Override   //sort 하기 위한 조건  //TreeSet은 자동으로 sort되서 나옴 
	public int compareTo(Employee o) {
			
		return number-o.number;
	}
	

	
	
	
	
}