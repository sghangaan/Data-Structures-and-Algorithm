package Stack;
import java.util.Scanner;
public class StackOperations {

    static int top=-1, size, capacity;
	static boolean empty, exit=false;
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("\n----------| PROGRAM FOR STACK OPERATION |----------\n");	
		
		System.out.print("How many elements will the stack have: ");
		capacity=input.nextInt();
		int[] stack = new int[capacity];
		
		System.out.println("\n-----------------| Stack Created |-----------------\n ");
		

		int choice;
		do {
			printMenu();
			System.out.print("\t Enter Choice [1...7]: ");
			choice=input.nextInt();
			chosen(choice,stack);
		} while (exit==false);
	}
	
	static void printMenu() {
		System.out.println("\n\tMENU");
		System.out.println("\t1.PUSH");
		System.out.println("\t2.POP");
		System.out.println("\t3.TOP");
		System.out.println("\t4.SIZE");
		System.out.println("\t5.EMPTY");
		System.out.println("\t6.DISPLAY STACK");
		System.out.println("\t7.EXIT");
	}
	
	static void chosen(int user, int[] stack) {
		switch (user) {
			case 1:
				push(stack);
				break;
			case 2:
				pop(stack);
				break;
			case 3:
				top(stack);
				break;
			case 4:
				size();
				break;
			case 5:
				empty();
				break;
			case 6:
				display(stack);
				break;
			case 7:
				exit();
				break;
		}
	}
	
	static void push(int[] stack) {
		int pushNum;
		if (top+1==capacity) {
			System.out.println("\nStack overflow/full, you could not push");
		} else {
			System.out.print("\nEnter number to add to the stack: ");
			pushNum=input.nextInt();
			top++;
			stack[top]=pushNum;
			size++;
			System.out.println("Stack data: "+pushNum+" successfully pushed");
		}
	}
	
	static void pop(int[] stack) {
		if (top==-1) {
			System.out.println("\nStack underflow/empty, you could not pop");
		} else {
			stack[top]=0;
			top--;
			size--;
			System.out.println("\nStack data: successfully popped");
		}
	}
	
	static void top(int[] stack) {
		if (top<0) {
			System.out.println("\nStack underflow/empty");
		} else {
			System.out.println("\nThe top value of the stack is: "+stack[top]);
		}
	}
	
	static void size() {
		if (size<1) {
			System.out.println("\nStack underflow/empty");
		} else {
			System.out.println("\nThe stack's size is: "+size);
		}
	}
	
	static void empty() {
		System.out.println("\nIs the stack Empty?");
		if (top==-1) {
    		System.out.print("Stack data: TRUE\n");
    	} else {	
        	System.out.print("Stack data: FALSE\n");
        }
	}
	
	static void display(int[] stack) {
		if (top==-1) {
    		System.out.print("\nStack is Empty\n");
    	} else {	
    		System.out.print("\nContent of stack:  ");
			for (int i = 0; i<size; i++) {
				System.out.print(stack[i]+"\t");
			}
			System.out.println();
        }
	}
	
	static void exit() {
		System.out.println("\n");
		System.out.println("# =========================================================================== #");		
		System.out.println("|                   2022 @ Sharon Grace T. Hangaan                            |");
		System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
		System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
		System.out.println("# =========================================================================== #");	
		exit=true;
	}
    
}
