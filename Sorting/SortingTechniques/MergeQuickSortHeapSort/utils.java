package Sorting.SortingTechniques.MergeQuickSortHeapSort;

import java.util.Arrays;
public class utils 
{
	static boolean exit=false;
	public static void chosen(int user, int [] list ) 
	{
		switch (user) 
		{
			case 1: 
				merge.sort(list);
				break;
			case 2: 
				quick.sort(list);
				break;
			case 3:
				heap.sort(list);
				break;
			case 4:
				exit();
				break;		
				}
			}
	
	public static void printMenu() 
	{
		System.out.println("\n============== MENU ==============\n");
		System.out.println("\t1.Merge Sort");
		System.out.println("\t2.Quick Sort");
		System.out.println("\t3.Heap Sort");
		System.out.println("\t4.Exit");
	}
			
	public static boolean exit() 
	{
		System.out.println("\n");
		System.out.println("# =========================================================================== #");		
		System.out.println("|                   2022 @ Sharon Grace T. Hangaan                            |");
		System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
		System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
		System.out.println("# =========================================================================== #");	
		return exit=true;
	}
	
	public static String repeat(String str, int count)
	{
		// create a char (count) times, then replace all of them with the given string
		return new String(new char[count]).replace("\0", str);
	}
}

