package day04;

import java.util.Arrays;

public class Test06 {

	public static void main(String[] args) {
		// 배열 선언, 생성 ,초기화
		int[] score = {88,99,100,22,56,88,99};
		String[] name = {"홍길동","김길동","고길동","박길동","최길동","이길동"};
		
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(name));
		
		if(name.length>6) {
			System.out.println(name[9]);
		}
		System.out.println("----------------------------------------------------");
		
		for(String data : name) {
			System.out.printf("**"+data.charAt(data.length()-1));
		}
		System.out.println();
		double sum =0;
		for(int data : score) {
			sum+=data;
		}
		System.out.printf("평균 = %.2f\n ",sum/score.length);
	}

}
