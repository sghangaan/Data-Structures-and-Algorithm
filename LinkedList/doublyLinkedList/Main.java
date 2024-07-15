package LinkedList.doublyLinkedList;

public class Main {
	public static void main(String[] args) {
		boolean exit = false;	
		dList doubly = new dList ();
		util.printTitle();
		util.printmenu();
	
		do {
			exit = util.choice(doubly);
		} while (exit==false);
		
		}
}

