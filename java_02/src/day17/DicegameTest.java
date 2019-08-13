package day17;

public class DicegameTest {

	public static void main(String[] args) {
		int n = 5;

		Dicegame d = new Dicegame();
		Dicegame d1 = new Dicegame();
		try {
			
		System.out.printf("똑같이 나온 횟수 : %d%n",d.countSameEye(n));
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("------------------------------------");
		try {
		System.out.printf("똑같이 나온 횟수 : %d%n",d1.countSameEye(-n));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
