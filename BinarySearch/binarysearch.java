package BinarySearch;

import java.util.Scanner;

public class binarysearch {
	
	static Scanner ent = new Scanner(System.in);
	static int sizeArr = 0,Snum,Mid,lEnd = 0,HEnd, MidVal,SFound;
	static int Arrlength[], ArrFound[];
	static int[] won,cha;
	static int n, i;
	
	 private static void displayMenu() {
		 	System.out.println("\n\tMENU");
			System.out.println("\t1.Seqential Search");
			System.out.println("\t2.Binary Search");
			System.out.println("\t3.Exit");
	 	  }

	 public static void sortArray(int arrayLength[]) {  
	        	n = arrayLength.length;  
	        for (int j = 1; j < n; j++) {  
	            int swap = arrayLength[j];  
	            int i = j-1; 
	            
	            while ( (i > -1) && (arrayLength[i] > swap) ) {  
	                arrayLength [i+1] = arrayLength[i];  
	                i--;  
	            }  
	            arrayLength[i+1] = swap;    
	        }  

	    }
		
	 public static void displayArray() {
	        n = Arrlength.length;
	        for (int a = 0; a < n; ++a) {
	            System.out.print(Arrlength[a] + "  "); 
	        }
	        System.out.println();
	    }
	
	 public static void searchSeque(int[] arrayLength, int arrayLengthTwo) {
		 	int Index = -1;
			for (int r = 0; r < arrayLength.length; r++) {
				
				  if(arrayLength[r] < Snum ) {
					  System.out.println("\tComparing " + arrayLength[r] + " < " + Snum);
					  System.out.println("\t------");
				  }
			    	
				  else if(arrayLength[r] > Snum ) {
					  System.out.println("\tComparing " + arrayLength[r] + " > " + Snum);
					  System.out.println("\t------");
				  }
			    	
				  else if(arrayLength[r] == Snum ) {
					  System.out.println("\tComparing " + arrayLength[r] + " == " + Snum);
					  System.out.println("\t------");
				  }
			    	
			      if (arrayLength[r] == arrayLengthTwo) {
			        // if the target is found, int index is set as the value of i and
			        // the for loop is terminated
			        Index = r;
			        break;
			      }
			  }
			    
			    if (Index == -1) {
			    	System.out.println("___________________________________________");
			    	System.out.println("\t----- " + Snum + " not Found! -----");
			    	System.out.println("___________________________________________");
			    } 
			    
			    else {
			    	System.out.println("___________________________________________");	
			    	System.out.println("\t----- " + arrayLength[Index] + " Found! -----"); 
			    	System.out.println("___________________________________________");
			    }
		     }
			
		  
		 public static void printdisArr(int lowEnd, int highEnd)
		  {
	        for (int o = lowEnd; o < highEnd; o++) 
	        {
	            System.out.print(Arrlength[o] + "  ");
	        }

	    }

	  
	  public static void searchBinary(int[] arrayLength, int searchNum, int lowEnd , int highEnd) { 	
		  	int index = -1,FoundIndx = 0;
		    highEnd = arrayLength.length - 1;
		    while (highEnd >= lowEnd){ 
		      Mid = (lowEnd + highEnd) / 2;
		      if(arrayLength[Mid] < searchNum ) {	
		    	  System.out.print("\tArray: ");
				  printdisArr(lowEnd,highEnd+1);
				  System.out.println();
				  System.out.println("\tComparing " + arrayLength[Mid] + " < " + searchNum);
				  System.out.println("\t------");
				  ArrFound[FoundIndx]=arrayLength[Mid];
				  FoundIndx++;  
			  }
		    	
			  else if(arrayLength[Mid] > searchNum ) {		
				  
		    	  System.out.print("\tArray: ");
				  printdisArr(lowEnd,highEnd+1);
				  System.out.println();				  
				  System.out.println("\tComparing " + arrayLength[Mid] + " > " + searchNum);
				  System.out.println("\t------");
				  ArrFound[FoundIndx]=arrayLength[Mid];
				  FoundIndx++;
			  }
		    	
			  else if(arrayLength[Mid] == searchNum ) {
				 
		    	  System.out.print("\tArray: ");
				  printdisArr(lowEnd,highEnd+1);
				  System.out.println();				  
				  System.out.println("\tComparing " + arrayLength[Mid] + " == " + searchNum);
				  System.out.println("\t------");
				  ArrFound[FoundIndx]=arrayLength[Mid];
				  FoundIndx++;
			  }

		      
		      if (arrayLength[Mid] == searchNum) {
		        index = Mid; 
		        break;
		      } 
		      else if (arrayLength[Mid] < searchNum) {
		        lowEnd = Mid + 1;
		      }
		      else if (arrayLength[Mid] > searchNum) {
		        highEnd = Mid - 1;
		    
		      }
		      
		    }
		    
		    System.out.print("\t");
		    displayArrFound();
		    System.out.println("___________________________________________");
		    
		    if (index == -1) {	
		    	System.out.println("\t----- " + searchNum + " not Found! -----");
		    	System.out.println("___________________________________________");
		    } 
		    
		    else {
		    	System.out.println("\t----- Found! -----"); 
		    	System.out.println("___________________________________________");
		    }
		  }
	
	  
		 public static void displayArrFound() {
	        for (int n = 0; n < ArrFound.length; n++) 
	        {
	        	if(ArrFound[n] != 0) 
	        	{
	        		System.out.print(ArrFound[n] + " ");
	        	}
	        }
	        System.out.println();
		 }
	
	public static void main(String[] args) {
		
		int Choices = 0;
		System.out.println("\n\t(================ SEARCHING =================)");
		System.out.println("\t(=========  SEQUENTIAL AND BINARY  ==========)");
		System.out.println("\t----------------------------------------------\n");

	    System.out.print("Enter the size of an Array: ");
		sizeArr = ent.nextInt();
		Arrlength = new int[sizeArr];
		ArrFound = new int[sizeArr];
		
		  
		  while(sizeArr <= 0) {
			  System.out.print("\nError! Please input 1 to above numbers.\n");
			  System.out.println("-------------------------------------------");
		      System.out.print("\n\nEnter the size of an Array: ");
		      sizeArr =  ent.nextInt();    
		  }
		  
		  System.out.println("-------------------------------------------");	
		  System.out.print("Enter " + sizeArr + " values: ");

		  for (int s = 0; s < sizeArr; s++) {
			  Arrlength[s] = ent.nextInt();
		  }
		  
		  sortArray(Arrlength);
          System.out.print("------ Sorted data: ");
          displayArray();	
          
          System.out.print("\nSearch: ");
          Snum = ent.nextInt();
		  
          	do {  
	          displayMenu();
	          System.out.print("\nEnter Choice [1..3]: ");
	          Choices = ent.nextInt();
	          System.out.println();  
	          
	          switch (Choices) {
	           case 1: 
	        	   searchSeque(Arrlength,Snum);
	        	   break;
	           case 2:
	        	   searchBinary(Arrlength,Snum,lEnd,HEnd);
	               break;
	           case 3:
					System.out.println("\n");
					System.out.println("# =========================================================================== #");		
					System.out.println("|                   2022 @ Sharon Grace T. Hangaan                            |");
					System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
					System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
					System.out.println("# =========================================================================== #");	
		    	   break;                       
	           	   default:
	        	   System.out.print("\nError. Please input number only from 1 - 3. Thank you");					
	          }
	      System.out.println();
	      } while (Choices != 3);        
          	ent.close();
	}

	}