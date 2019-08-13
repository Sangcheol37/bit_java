package day03;

public class Test06 {

	public static void main(String[] args) {
		// 1~100 합
		// 1+2 3456
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 합계: " + sum);

		// 1~100 까지의 숫자 중 4의배수의 합계
		sum=0;
		for (int j = 1; j <= 100; j++) {
			if(j%4==0) {
				sum+=j;
			}
		}
		System.out.println("1~100 사이의 4의 배수의 합계: "+sum);
	}
}
