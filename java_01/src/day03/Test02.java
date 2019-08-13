package day03;

public class Test02 {

	public static void main(String[] args) {

		int num = 99;
		int num1=0;
		
		String name = num > 0 ? "양수" : "음수";
		
		System.out.println(num > 0 ? "양수" : "음수");
		System.out.println(name);
		System.out.println(num1>0 ? "양수" : (num1 < 0 ? "음수" : 0) );
		String result = num1 > 0 ? "양수" : (num1 < 0 ? "음수" : "0");
		System.out.println("nu m1" + " : " + result);
		
	}

}
