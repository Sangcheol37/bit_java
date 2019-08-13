package day19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test01 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); //stack 후입선출
		//stack은 배열 기반으로 동작
		for (int i = 0; i < 100; i++) {
			stack.push(i + "");
		}
		System.out.println(stack.pop());

		Queue<Integer> que = new LinkedList<Integer>(); //queue 선입선출
		//queue는 LinkedList 기반으로 동작
		for (int i = 0; i < 100; i++) {
			que.offer(i);
		}
		System.out.println(que.poll());
	}
}
