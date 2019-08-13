package day03;

public class Test05 {

	public static void main(String[] args) {

		int i;
		for (i = 1; i < 10; i++) {
			System.out.println("Hello java "+i);
		}
		System.out.println(i);
		
		int j =10;
		
		while(j>0) {
			System.out.println("Hello java "+j);
			j--;
		}
		System.out.println(j);
		
		boolean flag = true;
		while(flag) {
			j++;
			System.out.println("-----------------"+j);
			if(j==5) {
				flag = !flag;
			}
		}
		System.out.println(j);
		System.out.println("---------------------------");
		do {
			System.out.println("do while");
		}while(j<5);
	}
}
