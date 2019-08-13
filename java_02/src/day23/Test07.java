package day23;

import java.io.RandomAccessFile;

public class Test07 {
	public static void main(String[] args) throws Exception{
		RandomAccessFile raf = new RandomAccessFile("rand.dat", "rw");
		
		String msg = "Hello, RandomAccessFile ... ";
		String result = null;
		
		raf.writeBytes(msg);
		
		raf.seek(0);
		while(true) {
			result = raf.readLine();
			if(result == null) break;
			System.out.println(result);
		}
		System.out.println("================================");
		raf.seek(raf.length());
		msg = "\n hi.. java test... io test... ";
		raf.writeBytes(msg);
		raf.seek(7);
		//왜 여기서 seek(7)이 맨처음 msg로가는것인가
		//기존 msg에 추가로 msg가 들어가나 
		
		// raf.writeBytes => rand.dat 에 기록된다.
		while(true) {
			result = raf.readLine();
			if(result == null) break;
			System.out.println(result);
		}
		System.out.println("================================");
		raf.close();
	}
}
