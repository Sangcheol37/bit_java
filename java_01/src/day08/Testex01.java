package day08;

public class Testex01 {
	public static void main(String[] args) {
		Te1 t1 = new Te1();
		System.out.println(t1.i);
	}

}

class Te1 {
	int i;

	public Te1() {
		i++;
	}
}