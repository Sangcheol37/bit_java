package day05;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		
		int[] scores = {77,99,100,85,91};
		int[] sc = new int[scores.length*2];
		
		System.arraycopy (scores, 0 ,sc , 0 ,scores.length);
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sc));
		
		String[] names = {"홍길동","박길동","고길동","최길동"};
		String[] na = new String[names.length*2];
		
		System.arraycopy(names, 0, na, na.length-names.length, names.length);
		//복사시작위치 조절 가능
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(na));
		
	}

}