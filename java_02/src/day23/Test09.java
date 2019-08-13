package day23;

public class Test09 {
	public static void main(String[] args) {
		// System.out.println(Thread.MAX_PRIORITY);//10
		// System.out.println(Thread.MIN_PRIORITY);//1
		// System.out.println(Thread.NORM_PRIORITY);//5

		System.out.println(" Main Start");
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.start();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread());
		
		// 스레드 실행대기 큐에 넣기
		
		t2.start();
		
		System.out.println("홀수합 + 짝수합 = " + (t1.sum+t2.sum));
		System.out.println(" Main End");
	}

	static class T1 extends Thread {
		int sum=0;
		public void run() {
			for (int i = 1; i < 100; i = i + 2) {
				sum += i;
				System.out.print(Thread.currentThread() + "   ");
				System.out.println("1~" + i + " 홀수합 : " + sum);
			}
		}
	}

	static class T2 extends Thread {
		int sum = 0;
		public void run() {
			for (int i = 0; i <= 100; i = i + 2) {
				sum += i;
				System.out.print(Thread.currentThread() + "   ");
				System.out.println("2~" + i + " 짝수합 : " + sum);
			}
		}
	}
}