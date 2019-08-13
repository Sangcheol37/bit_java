package day03_ex;

import java.util.Arrays;

public class Prob2 {

	public static void main(String[] args) {
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
			for (int j = 0; j < i; j++) {
				if (nums[j] == nums[i]) {
					i--;
					break;
				}
			}
		}

		System.out.println(Arrays.toString(nums));
		// 정렬 SORT

		System.out.println("=========정렬==========");

		for (int i = 0; i < nums.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[min] > nums[j]) {
					min = j;
				}
			}
			if (i != min) {
				int temp;
				temp = nums[i];
				nums[i] = nums[min];
				nums[min] = temp;
				count++;

			}
		}

		/*
		 * int min = nums[0]; int temp =0; for(int i=0;i<nums.length-1;i++) { for(int
		 * j=i+1;j<nums.length;j++) { if(nums[j]<min) { min=nums[j]; temp=j; } }
		 * nums[temp]=nums[i]; nums[i]=min; min=nums[i+1]; count++; }
		 */
		System.out.println(Arrays.toString(nums));
		System.out.println("count => " + count);
	}

}
