package day07;

public class Calc {
	
	//class variable
	static int data = 0;
	
	//instance method
	public long add(int a, int b ) {
		System.out.println(Calc.data);
		System.out.println(Math.random());
		return a+b;
	}

	//class method
	public static long minus(int a,int b) {
		return a-b;
	}
	
	public static long multi(int a , int b) {
		return a*b;
	}
	
	public static long div(int a , int b) {
		if(b==0)
			return 0;
		return a/b;
	}
}
