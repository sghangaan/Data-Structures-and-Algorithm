package ArrayImplementation;
import java.util.Scanner;

/*
 * 					Pseudocode
 	Program start
	      input array values and input values
	              Initialise variable arr=user value	
	               initialise variable as=uservalue
	       start loop 
		Calling arr and as variable for checking
		        Int max to check maximum values
		              returns to print max value
		                 Int min to check minimum values
		          returns to print min value 
		      end for loop 
 * 
 */


public class ArrayMaxMin {
	public static void main(String[] args) {

	Scanner  user =new Scanner(System.in);
	
	System.out.println("FIND THE MAXIMUM AND MINIMUM OF N NUMBERS IN AN ARRAY. \n ");
	
	System.out.print("Input Array Size:\t");
	int arr[],aS;
	aS=user.nextInt();
				
	System.out.print("Input " + aS + " value: ");
			
	arr=new int [aS];
	for(int i=0; i<aS;i++) {
			arr[i]=user.nextInt();
			}
				
		for(int j=0, ctrl = 0;j < aS; j++) {
						
			for(int i=0; i < aS; i++) {
				if(arr[j] == arr[i]){
				}
				else if(arr[j]>arr[i]){
					ctrl++;
					}	
				}
					
		// Checking  the given Max
		int max;
			if(ctrl != aS - 1) {
				ctrl = 0;
				}
			else {
			max = arr[j];
			System.out.print("Maximum Value \t" +max);
			break;
			}
		}
					
		// Checking  the given Min
		for(int j=0, ctrl = 0;j < aS; j++) {
			for(int i=0; i < aS; i++){
				if(arr[j] == arr[i]) {
					}
				else if(arr[j] < arr[i]){
					ctrl++;
					}			
				}					
		int min;	
		// Checking  the given Min			
				if(ctrl != aS - 1){
						ctrl = 0;
					}
				else {				
						min = arr[j];
						System.out.print("\nMinimum Value =\t" +min);
						break;
						}
					}
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
	

