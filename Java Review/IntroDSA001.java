
import java.util.Scanner;

public class IntroDSA001 {

	public static void main(String[] args) {

	Scanner user = new Scanner (System.in);
					
      		discplaychoices();		
      		System.out.println("");
      		int numReverse=0,Value=0, option;
      		
      		System.out.print("Input Integer Value: ");
      		Value =  user.nextInt();
      				
      		System.out.print("\nSelect Option: ");
      		option =  user.nextInt();
    
		switch (option) {
        
			case 1:   // Optipn 1: Sum of Digits
	
				  int reversedNum = 0, sum = 0;
				
  					while (Value != 0) {  // Loop to repeat the process 
  						reversedNum = reversedNum * 10 + Value % 10;
  					    Value = Value / 10;
  					   }
	
					System.out.print("\nSum of digits are ");

				    while (reversedNum > 0) { // Repeat steps until the number does not become 0
					    System.out.print((reversedNum % 10));
					      sum = sum + (reversedNum % 10); //Find the last digit of reversedNum and add it to the sum.
					      reversedNum = reversedNum / 10; //Remove the last digit of the reversedNum.
				     if (reversedNum > 0) { // Sysout the sign every loop condition
				            System.out.print(" + ");
				         }     
				     }  
				    
				    System.out.println("\nSum " + sum);
				    	System.out.println("Do you want to Select Option? [Y/N]: ");				    	
			    break;
						
			case 2:  // Optipn 2: Sum of Digits
					
					int digit;
					System.out.print("\nGiven " + Value);
						
						while (Value != 0) { // run loop until num becomes 0					
							digit = Value % 10; // get last digit from the value
							  numReverse = numReverse * 10 + digit;						
							Value /= 10; // remove the last digit from num
						}
							System.out.println("\nReversed the Number " + numReverse );
					break;

        
			 case 3: // Option 3: Display all the prime number from 2 to n
					
					int rem,n;					
  						for(int i=1; i<=Value;i++) {
      							n = i;
      							sum = 0;
      							rem = 0;
							
					  while(n>0) {
  								rem = n % 10;
  								sum = sum * 10 + rem;
  								n = n / 10;
  							}
                
    					if (i==sum) {
    							System.out.print(i+" ");
    							}
						}
					break;
					
			case 4: // Optipn 4: Palindrome Checking
					
					int subsFinal;
						
					System.out.print("\nPalindrome Checking");
					System.out.print("\nGiven " + Value);

			        subsFinal = Value;
    			        // Get the value number from the user and
    				       // store it in variable
			        while (Value != 0) {  
			        	  digit = Value % 10;
				            numReverse = numReverse * 10 + digit;
				        Value /= 10;
				      }
		
				         // check if reversedNum and subFinal are equal
				     if (numReverse == subsFinal)
				    	 System.out.print("\n" + numReverse + " is  Palindrome");
				     else
				         System.out.print("\n" + numReverse + " is Not palindrome");
				  break;		
				     
		            
			case 5:  //Optipn 5: Odd or Even number
									
				  	if (Value % 2 == 0 )
				       System.out.println("The entered value is Even");
		
				    else 
				       System.out.println("The entered value is Odd");
			    break;
			            
			case 6: // Optipn 6: EXIT (TERMINATE THE PROGRAMMER'S NAME)	
        
  					System.out.print("\nProgram Terminated.\n");
						System.out.println("\n\tProgrammer Name: Sharon Grace T. Hangaan");
					break;
					
			default:
						System.out.print("\nError. Please input number only from 1 - 6. Thank you");
					break;
						
					}
		}
	
	
		public static void discplaychoices() {
			System.out.println("\t__________________________________________________");
			System.out.println("\t         [   Introduction Part 1    ]            ");
			System.out.println("\t=================================================="); 
			System.out.println("\n\tOption 1: Sum of Digits");
			System.out.println("\tOption 2: Reverse Number");
			System.out.println("\tOption 3: Display all the prime number from 2 to n");
			System.out.println("\tOption 4: Palindrome Checking");
			System.out.println("\tOption 5: Odd or Even number");
			System.out.println("\tOption 6: Exit");
			System.out.println("\t=================================================="); 
		   
      }
	
    }
