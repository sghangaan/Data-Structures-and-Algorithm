package LinkedList.doublyLinkedList;

public class Insert {
	// Method para sa insert front
	public static void front(int data, dList list) {
		if(list.head ==null) {
			list.head = new node(null,data, null);
		}
		else {
			node newLink = new node(null, data, list.head);
			list.head.previous = newLink;
			list.head = newLink;
		}
		list.size++;
	}
	// Method para sa insert rear
	public static void rear(int data, dList list) {
		if(list.head == null)
			list.head = new node(null, data, null);
		else {
			node current = list.head;
			while(current.next != null) {
				current = current.next;
			}
			node newLink = new node(current,data,null);
			current.next = newLink;
		}
		list.size++; // 
	}
	// Method para sa insert sa given position
	public static void at(int data, int index, dList list) {
		if(list.head == null) {return;}
		if(index <1 || index > list.size) {return;}
		
		node current = list.head;
		int i = 1;
		while(i < index) {
			current = current.next;
			i++;
		}
		if(current.previous == null) {
			node newLink = new node(null, data,current);
			current.previous = newLink;
			list.head = newLink;
		}
		else {
			node newLink = new node(current.previous, data, current);
			current.previous.next = newLink;
			current.previous = newLink;
		}
		list.size++;	
	}
}
