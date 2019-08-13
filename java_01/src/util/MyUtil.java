package util;

public class MyUtil {

	//method 오버로딩 (매개변수의 타입이나 갯수가 달라야함)
	
	// public을 넣어야만 다른 패키지에서 사용 가능
	public static long add(int a, int b) {
		return a + b;
	}

	// method overloading 구분자의 이름이 add로 같지만 타입이 다르기 때문에 가능
	public static double add(double a, double b) {
		return a + b;
	}

	public static double add(double a, double b, double c) {
		return a + b + c;
	}
/*
	public static double add(double d, double e, double i, double f) {
		return d + e + i + f;
	}
*/
	
	// ... : []처리 (배열처럼 처리) nums 라는 배열
	//가변인자 (nums)는 반드시 마지막에 위치해야함 
	
	public static double add(double... nums) {
		double sum = 0;
		for (double data : nums) {
			sum+=data;
		}
		return sum;
	}
	
	
	//무조건 배열로만 넘겨야함
	/*
	public static double add(double[] a) {
		double sum = 0;
		for (double data : a) {
			sum+=data;
		}
		return sum;
	}
	*/
	
	public static String rightPad(String str, int size, char padChar) {
		int a = str.length();

		for (int i = 0; i < size - a; i++) {
			if (a < size) {
				str = str+padChar;
			}
		}
		return str;
	}
	
	
	
	public String leftPad(String str, int size, char padChar) {
		// 여기에 프로그램을 완성하십시오. 

		int a = str.length();

		for (int i = 0; i < size - a; i++) {
			if (a < size) {
				str = padChar + str;
			}
		}
		return str;
	}
/*
	public String leftPad(String str, int size, char padChar) {
		//여기에 프로그램을 완성하십시오. 

		 String str2=str;


		for (int i = 0; i < size - str.length(); i++) {
			if (str.length() < size) {
				str2 = padChar + str2;
			}
		}
		return str2;
	}
*/
	
public static int Maximum(int... nums) {
		
		int max = nums[0];
		for(int i=0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(max<nums[j]) {
					max=nums[j];
					break;
				}
			}
		}
		
		
		return max;
	}
	
	public static int max(int a, int b) {
		int max = Integer.MIN_VALUE;
		
		if(b>a) {
			max=b;
		}
		else {
			max=a;
		}
		
		return max;
	}
	
	public static int max(int ... a) {
		int max=Integer.MIN_VALUE;
	
		for(int data :a) {
			if(max<data) max = data;
		}
		return max;
	}
}
