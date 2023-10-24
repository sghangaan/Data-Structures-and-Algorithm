package ArrayImplementation;
/*
 *               Pseudocode
 *    		START
    Initialize Scanner and Size
	Print "Input array size:"
	Scan input array size
	Initialize arr1 with the user generated size
	Print "Input values"
	For a=0 to less than size
	input value to corresponding index a
	EndFor
	Call removeDuplicates method (int arr[], int n)
		initialize array out (array with removed duplicates)
		initialize array temp (boolean array corresponds to initial array, True=unique/False=duplicate)
		For a=0 to less than n - 1
			Set all values in temp to True (assuming all values are unique)
		EndFor
		For x=0 to less than n - 1
			If temp is true
				For y=x+1 to less than n - 1
					If arr[x] is equal to arr[y]
						Set temp index y to false
					EndIf
				EndFor
			EndIf
		EndFor
		For b=0 to less than n - 1
			If temp index b is true
				Set value of out index b the same as arr index b
			EndIf
		EndFor
		Return array out
	Print "Distinct Values: "
	For i=0 to less than size
		If the value of arr1 index i is not equal to 0
			Print value of the corresponding element + tab
		EndIf
	EndFor
	END
 */

import java.util.Scanner;

public class DeleteDuplicates {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("WRITE A PROGRAM TO DELETE DUPLICATE VALUES IN AN ARRAY.  \n ");
				
		int size;
		
		System.out.print("Input array size: ");
		size=input.nextInt();
		
		int[] arr1 = new int[size];

		System.out.print("Input "+size+" values: ");
		for (int a=0; a<size; a++) {
			arr1[a]=input.nextInt();
		}
		
		arr1 = removeDuplicates(arr1,size);
		
		System.out.print("Distinct Values: ");
		for (int i=0; i<size; i++) {
			if (arr1[i]!=0) {
				System.out.print(arr1[i]+"\t");
			}
		}
		  ENDOFPROGRAM();
	}
	
	static int[] removeDuplicates(int arr[], int n) {
	   int[] out = new int[n];
	   boolean[] temp = new boolean[n];
	   
	   for (int a=0; a<n-1; a++) {
		   temp[a]=true;
	   }
	   
	   for (int x=0; x<n-1; x++) {
		   if (temp[x]==true) {
			   for (int y=x+1; y<n-1; y++) {
				   if (arr[x]==arr[y]) {
					   temp[y] = false;
				   }
			   }
		   }
	   }
	   
	   for (int b=0; b<n-1; b++) {
		   if (temp[b] == true) {
			   out[b]=arr[b];
		   }
	   }
	   return out;
	 
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
