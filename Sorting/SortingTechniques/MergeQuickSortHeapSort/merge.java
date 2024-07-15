package Sorting.SortingTechniques.MergeQuickSortHeapSort;

import java.util.Arrays;

public class merge 
{
	public static void sort(int[] arr)
    {
		System.out.println("\n=========== MERGE SORT ===========\n");
		System.out.println("SOLUTION\n");

        int[] sorted = mergesort(arr);

        System.out.println("\nGiven array:");
        arrayprinter(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        arrayprinter(sorted, 0, arr.length - 1);
    }
	
	public static void mergesort(int [] arr, int len, String str, int indent)
	{
	      if (len < 2)
		  {
			  if (len == 1)
			  {
				  System.out.print(utils.repeat(" ", indent));
				  System.out.println(str + Arrays.toString(arr));
			  }
			  return;
		  }

		  System.out.print(utils.repeat(" ", indent));
		  System.out.println(str + Arrays.toString(arr));

	      int mid = len / 2;
	      int [] left_arr = new int[mid];
	      int [] right_arr = new int[len-mid];
	     
	      int k = 0;

	      for(int i = 0;i<len;++i)
	      {
	          if(i<mid)
	          {
	              left_arr[i] = arr[i];
	          }
	          else
	          {
	              right_arr[k] = arr[i];
	              k = k+1;
	          }
	      }
	   
	      mergesort(left_arr,mid, "L: ", indent + 3);
	      mergesort(right_arr,len-mid, "R: ", indent + 3);
	    
	      merge(left_arr,right_arr,arr,mid,len-mid);

		  System.out.print(utils.repeat(" ", indent + 3));
		  System.out.println(Arrays.toString(arr) + "\n");
	     
	  }
	

	 public static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){
	      
	      int i=0,left = 0, right = 0;
	      
	      while(left<left_size && right<right_size)
	      {
	          if(left_arr[left]<right_arr[right])
	          {
	              arr[i++] = left_arr[left++];
	          }
	          else
	          {
	              arr[i++] = right_arr[right++];
	          }
	      }
	      
	      while(left<left_size)
	      {
	          arr[i++] = left_arr[left++];
	      }
	      while(right<right_size)
	      {
	        arr[i++] = right_arr[right++];
	      }
	 }
	 
	 private static int[] mergesort(int[] arr)
	 {
		 int n = arr.length;

		 // create a copy
	     int[] copy = new int[n];
	     for (int i = 0; i < n; i++)
	     {
	    	 copy[i] = arr[i];
	     }

	     mergesort(copy, n, "   ", 0);

	     arrayprinter(copy, 0, n - 1);
	     return copy;
	 }
	 
	 private static void arrayprinter(int[] array, int low, int high)
	 {
		 for (int i = low; i <= high; i++)
			 System.out.print(array[i] + " ");
		 System.out.println();
	 }
}

