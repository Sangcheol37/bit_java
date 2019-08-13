package day04;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("알파벳 아스키 코드 값 확인 \n");

		Scanner scanner = new Scanner(System.in);
		char a = 'a';
		char A = 'A';
		char ch;

		for (int i = 0; i < 26; i++) {
			System.out.println(a + " : " + (int) a++ + " , " + A + " : " + (int) A++);

		}
		/*
		 * 변수 ch에 저장된 문자가 대문자 인 경우에만 소문자로 변경하는 코드를 완성합니다.
		 */
		
		
		System.out.println("문자 입력: ");
		String msg = scanner.nextLine();
		System.out.println("문자길이:"+msg.length());
		
		for(int i=0;i<msg.length();i++) {
		ch=msg.charAt(i);
		//ch = (char) scanner.nextInt();
		//char s = (ch>='A' && ch <= 'Z') ? (char)(ch+32) :ch;
		char s = (char) ((ch>='A' && ch <= 'Z') ? (ch+32) : ((ch>='a'&& ch<='z') ? (ch-32) : ch));
		//System.out.println(ch + " => " + s);
		System.out.print(s);
		if(i==(msg.length()-1)) {
			System.out.println("\n종료");
			System.exit(0);
		}
		}
		/*
		ch = 'F';
		char s =(ch>='A' && ch <= 'Z') ? (char)(ch+32) : ch ;
		
		System.out.println(ch + " => " + s);
		*/
	}

}
