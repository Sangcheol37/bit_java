package day06;

public class Test01 {	
	public static void main(String[] args) {
		int[] num = {2,4,6,8}; //생성, 초기화, 선언을 한번에 하는 경우
		
		int[] num2;
		num2 = new int[] {1,2,3,4,5,6,7,};  //new int 를 사용해서 초기화
		
		String[] arr = {"hello","java","test"};
		
		for(int data :num) {
			System.out.println(data);
		}
		
		for(String data :arr) {
			System.out.println(data);
		}
	}
}
