package day02;

public class Test06 {	
	public static void main(String[] args) {
	
		int num = 100;
		System.out.println(++num);
		System.out.println(num);
		
		System.out.println(6%4);
		System.out.println(6>4);
		 
		int x = 100, y = 101;
		System.out.println(x>=y ? x:y);
		
		int score = 99999;
		
		boolean result=0<= score && score <= 100;
		//boolean result=0<= score & score <= 100;
		
		System.out.println("score 유효성 검증 결과 : "+result);
		
		System.out.println(3|4);
		
		System.out.println(4<<2);
		System.out.println(16>>2);
		
		
	}
}
