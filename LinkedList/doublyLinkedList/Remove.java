package LinkedList.doublyLinkedList;

public class Remove {
	//removal sa front
	public static void front(dList list) {
		if(list.head == null) return;
		list.head = list.head.next;
		list.head.previous = null; // yung previous na yung magiging head nya
		list.size--;
	}
	//removal sa rear
	public static void rear(dList list) {
		if(list.head == null) {return;}
		
		if(list.head.next == null) {
			list.head = null;
			list.size--;
			return;
		}
		node current = list.head;
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
		list.size--;	
	}
	//removal sa given position
	public static void at(int index, dList list) {
		if(list.head == null ) return;
		if(index < 1 || index > list.size) return;
				
		node current = list.head;
		int i = 1;
		while( i < index) {
			current = current.next;
			i++;
		}
		if(current.next == null) {
			current.previous.next = null;
		}
		else if(current.previous == null) {
			current = current.next;
			current.previous = null;
			list.head = current;
		}
		else {
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		list.size--;
	}
}
