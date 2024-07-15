package LinkedList.doublyLinkedList;

public class node {
	private int data;
	public node previous;
	public node next;
	
	public node(int data) {
		previous = null;
		this.data = data;
		next = null;
	}
	
	public node(node previous, int data, node next) {
		this.previous = previous;
		this.data = data;
		this.next = next;
	}
	
	public int Data() {
		return data;
	}
}
