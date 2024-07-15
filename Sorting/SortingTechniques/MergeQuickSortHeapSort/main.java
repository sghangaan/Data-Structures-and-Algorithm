package Sorting.SortingTechniques.MergeQuickSortHeapSort;

import java.util.Scanner;
public class main {

	public static void main(String args[]) 
	{
		Scanner input = new Scanner (System.in);
		
		System.out.println("\n\t==== S O R T I N G ====");
		System.out.println("\tMerge || Quick || Heap \n");
		System.out.println("====================================");
			
		System.out.print("Enter the size of an array: ");
		int size = input.nextInt() ;
		int list [] = new int [size];
		
		System.out.print("Enter " + size + " values: ");
		for(int i = 0; i<list.length;i++) 
		{
			list[i] = input.nextInt();
		}
			
		int select = 0;
		do 
		{
			utils.printMenu();
			System.out.print("\t Enter Choice [1..4]: ");
			select=input.nextInt();
			utils.chosen(select, list);
		} while (utils.exit==false);
	}
}

