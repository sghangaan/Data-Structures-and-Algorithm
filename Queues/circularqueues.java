package Queues;

import java.util.Scanner;

public class circularqueues {
	static int menu = 0;
	public static void displaymenu() {
		System.out.print("\n\n\t|______Menu______|\n");
        System.out.print("\n\t1. Enqueue");
        System.out.print("\n\t2. Dequeue");
        System.out.print("\n\t3. Display Queue");
        System.out.print("\n\t4. Exit");
        System.out.print("\n\t--______________--");

        System.out.print("\n\nEnter Choice : ");
        menu = input.nextInt();
		
	}
	
	
	public static void printing() {
		System.out.print("\nQueue: "); 
		Front();
		if (front > rear) {
			Rear ();
		}
			System.out.print("\nFront: " + front);
	    	System.out.print("\nRear: " + rear);
	}

	
	static int rear = -1;	
	static int start = 0;
	static int front = -1;
	public static void enqueue() {	
			start = rear;    	
			rear = (rear + 1) % size;
		
		if(front == rear) {
			
		 		System.out.print("\n---------- Queue Overflow ---------");
		 		System.out.print("\n___________________________________\n");
		 		rear = start;
				}
		else { 
			
			ReEnt();
		}
		if(front == -1) {	
				front = 0;
			 	rear = 0;
				} 	
			queue[rear] = data;
		
		}
	
	
	static int data = 0;
	public static void ReEnt() {
		System.out.print("\nInput the element for insertion in Queue: ");
    	data = input.nextInt();   
    	
    	 	while(data <= 0){
         	
    	 		System.out.print("\n0 or Negative Numbers are not allowed");
    	 		System.out.print("\n\nEnter a number: ");
    	 		data =  input.nextInt();
    	 	}
    	 		
            	queue[rear] = data;   		
 	}
	
	
	public static void dequeue() {
		if(front == -1) {
    		System.out.print("\n---------- Queue is empty ---------");
	 		System.out.print("\n___________________________________\n");
			}
    	else {
	    		data = queue[front] = 0;
	    			if(rear == front) {
	    				front = -1;
	    				rear = -1;	
	    			}
	    			else {
	    				front = (front + 1) % size;
	    				
	    			}
    		}
	}
	
	public static void Front() {
		for(int b = front; b < size; b++) {
			
   			if(b < 0)    			
    			break;				   			
   			else if(queue[b] == 0) {
    			System.out.print(" ");
    		}
    		else if(b == size - 1) {
    			System.out.print(queue[b]);	
    		}
    		else {
       			System.out.print(queue[b] + " - ");	
    		}
		}			
	}
	
	
	public static void Rear () {	
		for(int b = 0; b <= rear; b++) {
    		if(queue[b] == 0) {
    			System.out.print(" ");
    		}
    		else if(b == size - 1) {
    			System.out.print(queue[b]);
    		}
    		else {
    			System.out.print(" - " + queue[b]);
    			
    		}
    	}
    		
	}
	
	
	public static void Exit() {
		System.out.println("\n");
		System.out.println("# =========================================================================== #");		
		System.out.println("|                   2022 @ Sharon Grace T. Hangaan                            |");
		System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
		System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
		System.out.println("# =========================================================================== #");	
	}


	static Scanner input = new Scanner(System.in);
	static int size = 0;	
	static int[] queue;
	public static void main(String[] args) {
		
		System.out.println("============  Circular Queue  ============");
		System.out.print("\nEnter the size of the Queue: ");
			size = input.nextInt();
			queue = new int[size];
			
			 while(size <= 0){
		        	System.out.print("\n0 or Negative Numbers are not allowed");
		        	System.out.print("\n\nEnter the size of the Queue: ");
		        	size =  input.nextInt();
		        }
			 do  {
				 displaymenu();
				 
				 switch(menu) {  
		            case 1:         	
		            	enqueue();
		            	printing();
		            	break;
		            case 2:
		            	dequeue();
		            	printing();
		            	break;
		            case 3:
		            	printing();
		            	break;
		            case 4:
		            	Exit();          
		            }
			 	}		 
			 while(menu != 4);        
		        input.close();
		    } 	
		}

