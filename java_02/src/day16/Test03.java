package day16;

import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		System.out.println(" main start  ");
		
	    //throw new RuntimeException(" ~~~ 문제 발생 ~~~");
		//unchecked Exception
		
		int score = 101;
		
		
		
		try{
			if(!(score >= 0 && score <=100))			
			throw new IOException("점수가 유효하지 않습니다.   ");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			
		}
		// Exception이 가장 밑에 있어야 한다.
		finally {
			
		}
		System.out.println(" main end ");
		
		//checked Exception (try catch 써줘야함)
		
	}
}
