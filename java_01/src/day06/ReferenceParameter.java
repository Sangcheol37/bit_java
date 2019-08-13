package day06;

import java.util.Arrays;

public class ReferenceParameter {
	
	public void increase(int[] n) {
		for(int i=0;i<n.length;i++) {
			n[i]++;
		}
	}
	
	public static void main(String[] args) {
		int[] ref1 = {100,800,1000};
		System.out.println(Arrays.toString(ref1));
		ReferenceParameter rp = new ReferenceParameter();
		rp.increase(ref1);
		System.out.println(Arrays.toString(ref1));
		/*
		for(int i=0;i<ref1.length;i++) {
			System.out.println("ref1["+i+"] :"+ref1[i]);
		}
		*/
	}
}
