package day10;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		char[] c = "ABCDEF".toCharArray();
		int cnt = 6;
		int d = 5;
		System.out.println(Arrays.toString(c));
		
		System.arraycopy(c, d+1, c, d, cnt-d-1);
		c[--cnt]=' ';
		System.out.println(Arrays.toString(c));
	}

}
