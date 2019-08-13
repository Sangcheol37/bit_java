package day24;

public class MyStack<E> {
	int[] stack;
	int cnt = 0;
	
	public MyStack(int size) {
		super();
		if (size < 0) {
			stack = new int[10];
		} else {
			stack = new int[size];
		}

	}

	public MyStack() {
		super();
		stack = new int[10];

	}

	public synchronized void push(int i) {
		if(isFull()) {
		//	System.out.println("Stack is full....");
			return;
		}
		stack[cnt] = i;
		cnt++;
		System.out.println("push => "+i);
		
		notifyAll();
	}

	public synchronized boolean isEmpty() {
		if (cnt == 0) {
			return true;
		}
		return false;
		// return cnt == 0 ? true : false;
	}

	public synchronized boolean isFull() {
		if (cnt == stack.length) {
			return true;
		}
		return false;
		//return cnt == stack.length ? true : false;
	}

	public synchronized int top() {
		if (isEmpty()) {
			return -1;
		}
		return stack[cnt-1];
	}
	public synchronized int pop() {
		if(isEmpty()) {
			//return -1;
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int data = stack[--cnt];
		System.out.println("                                             pop ==> "+data);
		notifyAll();
		return data;
	}
} 
