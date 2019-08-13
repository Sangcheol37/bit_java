package util;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {
	

	Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
	
	char[] naming = name.toCharArray();
	//char[] copy= {' ',' ',' ',' ',' ',' ',' ',' ',' '};
	char[] copy = new char[naming.length];
	
	int size = naming.length;
	//System.arraycopy(naming, 0, copy1, 0, size-1);

			
	int[] nums = new int[size];
	
	for(int i=0;i<size;i++) {
		nums[i]= (int) ((Math.random() * size));
		for(int j=0;j<i;j++) {
			if(nums[i]==nums[j]) {
				i--;
				break;
			}
		}
	}
	
	
	for(int i=0;i<size;i++) {
		copy[i]=naming[nums[i]];
	}
	
	System.out.println(Arrays.toString(copy));
	
	
	}
}
