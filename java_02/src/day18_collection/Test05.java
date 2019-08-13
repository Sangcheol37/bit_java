package day18_collection;

public class Test05 {
	public static void main(String[] args) {
		Employee e1 = new Employee(2017001,"홍씨","영업");
		Employee e2 = new Employee(2017002,"홍씨","영업");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode()==e2.hashCode());
		//hashcode가 같으면 e1 과 e2 가 같다고 함.
	
	}
}
