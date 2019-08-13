package day13;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		
		String s = "홍길동/이수신/김유신/박철";

 
		String msg = s.replace("/", " ");
		char[] c = msg.toCharArray();
		for(int i=0;i<msg.length();i++) {
			if(c[i]!='홍' && c[i]!='이' && c[i]!='김' && c[i]!='박' && c[i]!=' ' ) {
				c[i]='*';
			}
			System.out.printf("%c",c[i]);
		}
		
	}

}

