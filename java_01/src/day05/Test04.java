package day05;

import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
		// 난수발생
		// System.out.println((int)(Math.random()*10));
		// String[] args = {}
		// String[] args = {"5"}
		int count = 0;
		if (args.length == 0) {
			System.out.println("배열의 사이즈 정보를 실행 매개변수로 넘겨주세요..");
			System.out.println("실행예) java day05.Test04 5");
			return;
		}

		int[] nums = new int[Integer.parseInt(args[0])]; // dos 창에서 java day05.Test04 5 하면 실행가능
		// 1~45 사이의 난수를 발생시켜서 정수로 집어넣을것
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) ((Math.random() * 45) + 1);
		}

		System.out.println(Arrays.toString(nums));
		// 정렬 SORT

		System.out.println("=========정렬==========");

		// String[] n = {};

		// 오름차순
		// max 설정!!!

		int max = nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp;
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					count++;
					if (max == nums[(nums.length) - 1]) {
						break;
					}
				} else {
					if (max < nums[j]) {
						max = nums[j];
					}
				}
			}

		}
		System.out.println("max: " + max);
		System.out.println(Arrays.toString(nums));
		System.out.println("count => " + count);

		/*
		 * //내림차순 int min=nums[0]; for(int i=0;i<nums.length-1;i++) { for(int
		 * j=i+1;j<nums.length;j++) { if(nums[i]<nums[j]) { int temp; if(min>nums[i]) {
		 * min=nums[i]; } temp=nums[i]; nums[i]=nums[j]; nums[j]=temp; count++;
		 * if(min==nums[(nums.length)-1]) { System.out.println("빠져나감"); break; } } }
		 * System.out.println(Arrays.toString(nums)); }
		 * System.out.println("count => "+count);
		 */
		// 스와핑 작읍얼 최소한 수행하게 코드 수정합니다.
		// max min 을 설정해서 하면 ?

	}
}
