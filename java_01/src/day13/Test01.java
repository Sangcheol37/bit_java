package day13;

import java.util.Calendar;
import java.util.Formatter;

public class Test01 {
	public static void main(String[] args) throws Exception{
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		String data = String.format("현재시간은 %tk 시 : %tM 분 : %tS초 %n", c,c,c);
		System.out.println(data);
		
		System.out.printf("%f",Math.PI);
		String f = String.format("%f", Math.PI);
		System.out.println("---------------------------------------------");
		StringBuffer sb = new StringBuffer();
		//Formatter fm =new Formatter(sb);
		Formatter fm = new Formatter("sss.txt");
		
		fm.format("현재시간은 %tk 시 : %tM 분 : %tS초 %n", c,c,c);
		System.out.printf("%f  %n",Math.PI);
		System.out.println(sb);
		fm.flush();
		
		System.out.println("main end");
	}
}
