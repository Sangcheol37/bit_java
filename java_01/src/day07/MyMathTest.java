package day07;

import java.util.Arrays;

import util.MyUtil;

public class MyMathTest {

	public static void main(String[] args) {
		System.out.println(MyUtil.add(33, 99));

		System.out.println(MyUtil.add(33.3, 99.4));
		
		System.out.println(MyUtil.add(33.3, 99.4, 90));
		
		System.out.println(MyUtil.add(33.3, 99.4, 90, 55.9));
		
		System.out.println(MyUtil.add(1,2,3,4,5,6,7,8,9,10));

		System.out.println(MyUtil.add(new double[] {1,2,3,4,5,6,7,8,9,10}));
		double[] d = new double[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(Arrays.toString(d));
		
		
		//오토박싱 언박싱 : 기본형과 참조형 사이를 알아서 왔다갔다 하면서 형변환 해줌
		int i = 100;
		//Integer ii = new Integer(100);
		Integer ii = i;
		
		i=ii;
		System.out.println(i+"   "+ii);
	}

}
