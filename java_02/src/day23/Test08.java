package day23;

public class Test08 {
	public static void main(String[] args) {
		// System.out.println(Thread.MAX_PRIORITY);//10
		// System.out.println(Thread.MIN_PRIORITY);//1
		// System.out.println(Thread.NORM_PRIORITY);//5
		
		System.out.println(" Main Start");
		/*
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		Thread.yield();    //무시( 기다리는 애가 없음으로)
		System.out.println(Thread.currentThread());
		Job1 job1 = new Job1();
		Job2 job2 = new Job2();
		Thread t1 = new Thread(job1,  "job1");
		Thread t2 = new Thread(job2,  "job2");
		//스레드 실행대기 큐에 넣기
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			//t1과 t2가 끝날때 까지 나머지 쓰레드는 다 기다려야함. (t1과 t2 끝날때까지 다른 작업 수행 못함)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("홀수합 + 짝수합 = " + (job1.sum+job2.sum));
	
		System.out.println(" Main End");
	}
}

class Job1 implements Runnable {
	int sum = 0;
	@Override
	public void run() {
		for(int i = 1;i<100;i=i+2) {
			sum+=i;
			System.out.print(Thread.currentThread()+"   ");
			System.out.println("1~"+i+" 홀수합 : "+sum);
			Thread.yield();
		}
	}
}

class Job2 implements Runnable {
	int sum = 0;
	@Override
	public void run() {
		for(int i = 0;i<=100;i=i+2) {
			sum+=i;
			System.out.print(Thread.currentThread()+"   ");
			System.out.println("2~"+i+" 짝수합 : "+sum);
			Thread.yield();
		}
	}
}