package day03_ex;

public class Prob1 {
	public static void main(String[] args) {
		Prob1 prob1 = new Prob1();

		System.out.println("========LeftPad=========");
		System.out.println(prob1.leftPad("bit", 6, '#'));
		System.out.println(prob1.leftPad("bit", 5, '$'));
		System.out.println(prob1.leftPad("bit", 2, '&'));
		System.out.println("========RightPad========");
		System.out.println(prob1.rightPad("bit", 6, '#'));
		System.out.println(prob1.rightPad("bit", 5, '$'));
		System.out.println(prob1.rightPad("bit", 2, '&'));

	}

	public String rightPad(String str, int size, char padChar) {
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
}
