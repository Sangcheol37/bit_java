package day05;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int num1 = 99;
		int num2 = num1;
		System.out.println("num1="+num1+" , num2="+num2);
		num1=77;
		System.out.println("num1="+num1+" , num2="+num2);
		
		//call by value
		//call by reference
		
		int[] n1 = {11,22,33,44,55};
		int[] n2 = n1;
		
		int[] n3 = new int[1];
		for(int i=0;i<n1.length;i++) {
					n3[i]=n1[i]; //array code
				}
		
		
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		n1[2]=0;		
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
	}

}
