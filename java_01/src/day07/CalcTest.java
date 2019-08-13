package day07;

public class CalcTest {

	public static void main(String[] args) {

		Calc c1 =new Calc(); 
		
		System.out.println(c1.add(11, 99)); //instance method 이기때문에 사용하려면 주소가 필요. 
		System.out.println(Calc.minus(11, 99)); //class method 를 사용하면 생성자 없이 바로 사용가능
		System.out.println(Calc.multi(11, 99));
		System.out.println(Calc.div(11, 99));
		
		
	}

}
