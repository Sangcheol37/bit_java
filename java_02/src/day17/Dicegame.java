package day17;

class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1;
		return number;
	}
}

public class Dicegame {
	public int countSameEye(int n) throws Exception {
		if (n < 0) {
			throw new Exception("음수는 불가능");
		}
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		int cnt = 0;
		int i = 0;

		while (i < n) {
			int s1 = d1.play();
			int s2 = d2.play();
			System.out.printf("주사위 1 : %d%n", s1);
			System.out.printf("주사위 2 : %d%n", s2);

			if (s1 == s2) {
				System.out.println("같다!!!!");
				cnt++;
			}
			System.out.println();
			i++;
		}

		return cnt;

	}
}
