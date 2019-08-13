package day04;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		String[] name = new String[5];
		Scanner scanner = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("이름을 입력하세요: ");
			name[i]=input.nextLine().trim();
			System.out.println("점수를 입력하세요: ");
			num[i]=scanner.nextInt();
			
		}
		for(int j=0;j<5;j++) {
			System.out.println("이름: "+name[j]+" "+"점수 :"+num[j]);
		}
	}

}
