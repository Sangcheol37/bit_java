package util;

import java.util.Arrays;

public class Sort {

	public static int[] sort(int[] nums) {
		// 배열 원본은 변경이 되지 않도록 하고 정렬된 오름차순 int[]을 리턴하라.

		int[] sort = new int[nums.length];
		// System.arraycopy(nums, 0, sort, 0, nums.length);

		for(int i=0;i<nums.length;i++) {
			sort[i]=nums[i];
		}
		
		
		for (int i = 0; i < sort.length - 1; i++) {
			for (int j = i + 1; j < sort.length; j++) {
				if (sort[i] > sort[j]) {
					int temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
			}
		}

		return sort;
	}
	//숫자를 넘겨 받아 그중 가장 큰수를 리턴하는 함수 max
	
	
}
