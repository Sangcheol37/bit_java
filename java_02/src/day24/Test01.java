package day24;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("main Start");
		Account account = new Account("2019001","홍길동",100000);
		
		Job1 job1 = new Job1(account);
		Job1 job2 = new Job1(account);
		
		Thread t1 = new Thread(job1,"통장");
		Thread t2 = new Thread(job2,"카드");
		
		t1.start();
		t2.start();
		
		//ArrayList()
		//Vector() //vector에는 synchronized 처리가 되어잇음
		
		
		System.out.println("main End");
	}
}

class Job1 implements Runnable{
	Account ac;

	public Job1() {}
	public Job1(Account ac) {
		this.ac = ac;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			int money = (int) (Math.random()*10+1)*1000;
			ac.withdraw(money);
		}
	}
	
}

class Account{
	String number;
	String name;
	int money;
	
	public Account() {}

	public Account(String number, String name, int money) {
		super();
		this.number = number;
		this.name = name;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", money=" + money + "]";
	}
	
	//출금
	public synchronized void withdraw(int money)
	{
		System.out.println("*********출금"+money+" ***************");
		System.out.println(Thread.currentThread());
		if(this.money >= money) {
			this.money-=money;
			System.out.println("출금완료 : "+money);
			System.out.println("잔고  : " +this.money);
		}
		else
		{
			System.out.println("잔액 부족!!");
		}
		System.out.println("*************************************");
	}
}

