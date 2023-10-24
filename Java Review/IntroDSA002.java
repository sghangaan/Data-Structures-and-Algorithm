import java.util.Scanner;

public class IntroDSA002 {

	public static void main(String[] args) {

	Scanner user = new Scanner (System.in);
	discplaychoices();
	
	System.out.print("INPUT STRING 1: ");
	String Strg1 =  user.nextLine();
			
	System.out.print("INPUT STRING 2: ");
	String Strg2 =  user.nextLine();
	
	
	int option;
	System.out.print("\nSelect Option: ");
	option =  user.nextInt();

		switch(option) {
      		case 1: // Option 1: String Copy
      			
      			int strCopy;
      			
      			System.out.print("\nString Copy: ");
      			strCopy = user.nextInt();     			
        				switch(strCopy) {
        					case 1:
        						System.out.print("String 3 is: " + Strg1+"\n");
        						break;
        					case 2:
        						System.out.print("String 3 is: " + Strg2+"\n");		  
        						break; }
        
        				break;
		
      				
        		case 2:  // Option 2: String Concatenation
        			
        					System.out.println("\nString Concatenation ");
        					System.out.println("String 1 Concatenate to String 2");
        					System.out.println("OUTPUT: " + Strg1 + Strg2);
        
        				break;
        			
        		case 3: // Option 3: String Comparison
        			
        				System.out.println("\nString Comparison");
        				System.out.println("OUTPUT: String 1 and String 2");
            				
            				if(Strg1.compareTo(Strg2)==0) {
            					System.out.println("Equal");
            					} 
            				else {
            					System.out.println("OUTPUT: Not Equal");
            				}
        				
        			   break;
        		     
      		case 4: // Option 4: Reverse the First String
      			
          				System.out.print("\nReverse the First String Input");
          				String reversedStr = new StringBuffer(Strg1).reverse().toString();
          				System.out.println("\nOUTPUT: " + reversedStr);   
            
      				  break;
      				
      		case 5: // Option 5: Convert the First String into Uppercase and Lowercase
      			
            			System.out.print("\nString 1: " + Strg1);
            			System.out.print("\nUppercase: " + Strg1.toUpperCase());
            			System.out.print("\nLowercase: " + Strg1.toLowerCase()+"\n");
        
                 break;		

      		case 6: // Option 6: Toggle the First String
            			System.out.print("\nToggle the first String");
            			System.out.print("\nString 1: " + Strg1);
            			String toggleStr = "";
      			
            			for (int a = 0; a < Strg1.length(); a++)
            			{
            				char b = Strg1.charAt(a);
            				boolean check = Character.isUpperCase(b);
            				
            				if (check == true)
            					toggleStr = toggleStr + Character.toLowerCase(b);
            				else
            					toggleStr = toggleStr + Character.toUpperCase(b);				
            			}
            			System.out.println("\nOUTPUT: " + toggleStr);
      			break;

      		case 7: // Option 7: EXIT (TERMINATE THE PROGRAMMER'S NAME)			
          			System.out.print("\nProgram Terminated:\n");
          			System.out.println("\n\tProgrammer Name: Sharon Grace T. Hangaan");

      			break;

      		default: // 
            			System.out.print("\nError.Please input number only from 1 - 7.\n");	
      			break;
      				
      			}
	}
	
	public static void discplaychoices() {
		
    		System.out.println("\t__________________________________________________");
    		System.out.println("\t         [   Introduction Part 2    ]            ");
    		System.out.println("\t=================================================="); 
    		System.out.println("\n\tOption 1: String Copy");
    		System.out.println("\tOption 2: String Concatenation");
    		System.out.println("\tOption 3: String Comparison");
    		System.out.println("\tOption 4: Reverse the First String");
    		System.out.println("\tOption 5: Convert the First String into Uppercase and Lowercase");
    		System.out.println("\tOption 6: Toggle the First String");
    		System.out.println("\tOption 7: Exit\n");
    		System.out.println("\t=================================================="); 
		
	  }
}
