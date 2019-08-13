package util;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int[] nums = {40,30,50,20,10,5,2,3,4}; 
		
		int[] result = Sort.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(result));
		 
	}
}
