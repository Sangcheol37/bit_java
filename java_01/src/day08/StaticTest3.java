package day08;

public class StaticTest3 {

	public static void main(String[] args) {
		System.out.println(Count.count);
		Count c1 = new Count();
		System.out.println(Count.count);
		Count c2 = new Count();
		System.out.println(Count.count);
		Count c3 = new Count();
		System.out.println(Count.count);
		Count c4 = new Count();
		System.out.println(Count.count);
	}

}

class Count{
	int c;
	static int count; //클래스변수 선언
	public Count() {
		c++;
		count++;
	}
}