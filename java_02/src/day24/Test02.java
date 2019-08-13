package day24;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		MyStack stack = new MyStack();
		push job1 = new push(stack);
		pop job2 = new pop(stack);
		
		Thread push = new Thread(job1,"push");
		Thread pop = new Thread(job2,"pop");
		
		push.start();
		pop.start();
		
		System.out.println("main end");
	}
}

class push implements Runnable{
	MyStack stack;
	
	public push() {}
	
	public push(MyStack stack) {
		this.stack = stack;
	}


	public void run() {
		for(int i=0;i<10;i++) {
			stack.push(i);
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	
		}
	}
}

class pop implements Runnable{
	MyStack stack;
	
	public pop() {}
	
	public pop(MyStack stack) {
		this.stack = stack;
	}


	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			stack.pop();
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}