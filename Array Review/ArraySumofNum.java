package ArrayImplementation;

/* Pseudocode
	START
	Print"1. SUM OF N NUMBER IN AN ARRAY."
	Print "Input size values: "
	Initialize arr1 with the user generated size
	Scan input array values 
	        For 
	                 initialize i=0 to less than user generated size
	               Scan input array number
	          increment the value of i
	       EndFor
	Initialize sum = 0
	Loop through the array to calculate sum of elements  
	      For
	                 initialize i=0 to less than user generated size
	              Scan input array number
	            Add the array of i and store it to the variable of sum
	         increment the value of i
	      EndFor
	Print "Sum  size  value: "
	Print sum
	End. */



import java.util.Scanner;

public class ArraySumofNum {
	
public static void main(String[] args) {
		
		Scanner user_input=new Scanner(System.in);
		
		System.out.println("SUM OF N NUMBER IN AN ARRAY.\n ");
		
		System.out.print("Input array size: ");
		int number[],size;
		size=user_input.nextInt();
		
		System.out.print("Input " + size + " value: ");
		
		number=new int [size];
		for(int i=0; i<size;i++) {
				number[i]=user_input.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i< size;i++) {
				sum=sum+number[i];
			}
			System.out.println("Sum " +  size + " value "+sum);
			ENDOFPROGRAM ();
	}

static void ENDOFPROGRAM () {
		System.out.println("\n");
		System.out.println("# =========================================================================== #");		
		System.out.println("|                   2022 @ Sharon Grace T. Hangaan                            |");
		System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
		System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
		System.out.println("# =========================================================================== #");	
	}

}
