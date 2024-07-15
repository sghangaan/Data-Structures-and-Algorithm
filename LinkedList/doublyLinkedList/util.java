package LinkedList.doublyLinkedList;

import java.util.Scanner;
public class util {
	public static void print(dList list) {
		node current = list.head;
		System.out.print("\nList: ");
		while(current != null) {
			String nd = ("[" + current.Data() + "]== ");
			System.out.print(nd);
			current = current.next;
		}
		System.out.print("\nPos : ");
		current = list.head;
		for (int x=1; current != null; x++) {
			String nd = ("[" + current.Data() + "]== ");
			System.out.print(" " + x + repeat(" ", nd.length()-2));
			current = current.next;
		}
		System.out.println();
	}
	public static void printTitle() {
		System.out.println("\n\t_______ Doubly ________");
		System.out.println("\t===== Linked list ======");
		System.out.println("  ____________________________________");
	}
	public static void printmenu() {
		System.out.println( "___________________________| Menu |____\n");
		System.out.println( "\t1. Insert Front");
		System.out.println( "\t2. Insert Rear");
		System.out.println( "\t3. Remove in Front");
		System.out.println( "\t4. Remove in Rear");
		System.out.println( "\t5. Insert at Given Position");
		System.out.println( "\t6. Remove at Given Position");
		System.out.println( "\t7. Size of List");
		System.out.println( "\t8. Is List Empty?");
		System.out.println( "\t9. Print List");
		System.out.println( "\t10. Exit ");
	}
	private static String repeat(String str, int count)
    {
        return new String(new char[count]).replace("\0", str);
    }
	public static boolean choice(dList list) {
		System.out.println("  ____________________________________\n");
		System.out.print("\tENTER YOUR CHOICE HERE: ");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		switch(option) {
			case 1:
				System.out.print("Insert in Front: ");
				Insert.front(sc.nextInt(), list);	
				print(list);
				break;
			case 2:
				System.out.print("Insert in Rear: ");
				Insert.rear(sc.nextInt(), list);
				print(list);
				break;
			case 3:
				System.out.print("Successfully Remove in Front: ");
				Remove.front(list);
				print(list);
				break;
			case 4:
				System.out.print("Successfully Remove in Rear: ");
				Remove.rear(list);
				print(list);
				break;
			case 5:
				System.out.print("Insert data: ");
				int data = sc.nextInt();
				System.out.print("Index at: ");
				int pos = sc.nextInt();
				Insert.at(data, pos, list);
				print(list);
				break;
			case 6:
				System.out.print("Remove data Index at: ");
				Remove.at(sc.nextInt(), list);
				print(list);
				break;
			case 7:
				System.out.print("\t     =| Size: " + list.size + "|=");
				System.out.println();
				break;
			case 8:
				System.out.print("\t   =| Empty: " + list.isEmpty() + "|=");
				System.out.println();
				break;
			case 9:
				System.out.print("Your Doubly Linked list: ");
				print(list);	
				break;
			case 10: 
				System.out.println("\n");
				System.out.println("# =========================================================================== #");		
				System.out.println("|                   2022 @ Sharon Grace T. Hangaan                            |");
				System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
				System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
				System.out.println("# =========================================================================== #");	
				return true;
			default:
				System.out.print("\nError. Please input number only from 1 - 10. Thank you");
		}
		return false;
	}
}
