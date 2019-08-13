package day16;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(" main start");
		int a = 10, b = 0;

		// 예외처리는 try catch

		try {
			System.out.println(1);
			System.out.println(a / b); // throw new ArithmeticException() 예외 발생
			System.out.println(2);
		} catch (ArithmeticException e) { 
			//예외가 발생하면 catch 구문 들어오고 예외없을 경우 try끝까지 진행
			System.out.println("예외 발생 : " + e.getMessage());
			e.printStackTrace();
			System.out.println(3);
		}finally {
			System.out.println("finally{ 항 상 수 행  }   ");
		}

		// 원래는 이렇게 사용하는 것이 적절하다.
		if (b != 0) {
			System.out.println(a / b);
		}

		System.out.println(" main end");
	}
}

//ArithmeticException ss; //RuntimeException 의 자식
//NullPointerException nn; //RuntimeException 의 자식
//IndexOutOfBoundsException ii; //RuntimeException 의 자식