package day18_collection;

public class MyStack2 {
	int number;
	int[] stack;
	int cnt = 0;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public MyStack2(int number) {
		super();
		this.number = number;
		if (number < 0) {
			stack = new int[10];
		} else {
			stack = new int[number];
		}

	}

	public MyStack2() {
		super();
		stack = new int[10];

	}

	void push(int i) {
		if(isFull()) {
		//	System.out.println("Stack is full....");
			return;
		}
		stack[cnt] = i;
		cnt++;
	}

	boolean isEmpty() {
		if (cnt == 0) {
			return true;
		}
		return false;
		// return cnt == 0 ? true : false;
	}

	boolean isFull() {
		if (cnt == stack.length) {
			return true;
		}
		return false;
		//return cnt == stack.length ? true : false;
	}

	int top() {
		if (isEmpty()) {
			return -1;
		}
		return stack[cnt-1];
	}
	int pop() {
		if(isEmpty()) {
			return -1;
		}
		int s = stack[cnt-1];
		stack[cnt-1]=0;
		cnt--;
		return s;
	}
}
