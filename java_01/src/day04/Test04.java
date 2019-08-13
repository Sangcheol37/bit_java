package day04;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		// Array :
		int[] score; // 배열 선언
		score = new int[5]; // 배열 생성

		for (int i = 0; i < 5; i++) {
			System.out.print(score[i] + "      ");
		}
		System.out.println();

		String[] name = new String[5];

		for (int j = 0; j < 5; j++) {
			System.out.print((name[j]) + "    ");
		}
		System.out.println();
		System.out.println("==============================");

		score[0] = 99;
		score[1] = 100;
		score[2] = 69;
		score[3] = 79;
		score[4] = 89;

		name[0] = "홍길동";
		name[1] = "고길동";
		name[2] = "박길동";
		name[3] = "김길동";
		name[4] = "강길동";

		double avg = 0.0;
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = sum / score.length;
		
		System.out.println(Arrays.toString(score));
		System.out.println(Arrays.toString(name));
		
		// 홍** 99 평균이상
		
		System.out.println("합계: " + sum + " " + "평균 : " + avg);
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i].charAt(0)+"**      "+score[i]+
					(score[i] >= avg ? "   평균이상" : "   평균미달"));
			/*
			if(score[i]>=avg) {
				System.out.println(name[i].charAt(0)+"**은 평균이상입니다.");
			}
			else
				System.out.println(name[i].charAt(0)+"**은 평균미만입니다.");
				*/
		}
	}

}
