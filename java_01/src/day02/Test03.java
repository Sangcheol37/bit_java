package day02;

public class Test03 {
	public static void main(String[] args) {
		int x = 600, y = 700;
		int temp;
		System.out.println("x="+x+", y="+y+", x+y="+(x+y));
		System.out.printf("x=%d, y= %d, x+y=%d\n",x,y,x+y);
		System.out.printf("x=%10d, y=%d, x+y=%d%n",x,y,x+y);
		System.out.printf("x=%s, y=%s, x+y=%s%n",x,y,x+y);
		temp=x;
		x=y;
		y=temp;
		System.out.printf("x=%d, y=%d%n",x,y);
		System.out.println("--------------------------------\n");
		
		double d1 = 99.12689, d2 = 77.8922;
		System.out.printf("d1 = %.2f , d2 = %6.2f%n",d1,d2);
		double temp1;
		temp1=d1;
		d1=d2;
		d2=temp1;
		System.out.printf("d1 = %5.2f, d2 = %11.2f%n",d1,d2);
	}
}
