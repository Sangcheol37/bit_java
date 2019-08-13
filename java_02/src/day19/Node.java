package day19;

public class Node<E> {
	E data;
	Node<E> next;
	Node<E> prev;
	
	public Node(E data, Node<E> next, Node<E> prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	public Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
}
