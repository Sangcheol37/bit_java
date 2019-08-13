package day06;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String arr = scanner.nextLine();
		int cnt=0;
		
		for(int i=0;i<arr.length()-1;i++) {
			for(int j=i+1;j<arr.length();j++) {
				if(arr.charAt(i) == 'v' && arr.charAt(j)=='a' ) {
					System.out.println((char)arr.charAt(i)+""+(char)arr.charAt(j));
					break;
				}
			}
		}
		System.out.println("---------------------------");
		
		for(int i=0;i<arr.length();i++) {
			if(arr.charAt(i)=='r') {
				cnt++;
			}
		}
		System.out.println("r의 갯수: "+cnt);
			
	}

}
