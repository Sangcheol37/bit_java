package day18_collection;

public class MyStack<E> {
	E[] stack;
	int cnt = 0;
	
	public MyStack(int size) {
		super();
		if (size < 0) {
			stack = (E[]) new Object[10];
		} else {
			stack = (E[]) new Object[size];
		}

	}

	public MyStack() {
		super();
		stack = (E[]) new Object[10];

	}

	public void push(E i) {
		if(isFull()) {
		//	System.out.println("Stack is full....");
			return;
		}
		stack[cnt] = i;
		cnt++;
	}

	public boolean isEmpty() {
		if (cnt == 0) {
			return true;
		}
		return false;
		// return cnt == 0 ? true : false;
	}

	public boolean isFull() {
		if (cnt == stack.length) {
			return true;
		}
		return false;
		//return cnt == stack.length ? true : false;
	}

	public E top() {
		if (isEmpty()) {
			return null;
		}
		return stack[cnt-1];
	}
	public E pop() {
		if(isEmpty()) {
			return null;
		}
		return stack[cnt--];
	}
} 
