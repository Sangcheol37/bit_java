package day06;

public class ValueParameter {
	public static int increase(int n) {
		++n;
		return n;
	}
	
	public static void main(String[] args) {
		int var1 = 100;
		//ValueParameter vp = new ValueParameter();
		int var2 = ValueParameter.increase(var1); //increase 시켜도 var1의 값은 변하지 않는다
		System.out.println("var1 : "+var1+", var2 " +var2 );
		
	}
}
