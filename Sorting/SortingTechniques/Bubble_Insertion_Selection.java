package Sorting.SortingTechniques;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Insertion_Selection {
    
	
	public static void main(String[] args) {
		
		System.out.println("\n\t(================ SORTING =================)");
		System.out.println("\t(==== Bubble, Insertion and Selection =====)");
		System.out.println("\t--------------------------------------------");
		
		
		Scanner sc = new Scanner(System.in);
		int option;
		System.out.print("\nEnter the size of an array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		do {
			printMenu();
			System.out.print("\tENTER YOUR CHOICE: ");
			option = sc.nextInt();
			System.out.println("----------------------------------------------------------");
			
			switch (option) {
			case 1:
				int swap = 0; 
				System.out.print("Enter " + size + " values: ");
				for (int i = 0; i < size; i++) {
					arr[i] = sc.nextInt();
				}
				System.out.println("----------------------------------------------------------");
				for (int i = 0; i < arr.length  - 2; i++) {
					for (int j = 0; j < arr.length - 1; j++) {
						if (arr[j] > arr[j + 1]) {
							swap = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1] = swap;
						}
						for (int k = 0; k < arr.length ; k++) {
							System.out.print("\t"+ "[" + arr[k] + "]");
						} 
						System.out.println();
					}
					System.out.println();
				}
				break;
			case 2:	
				System.out.print("Enter " + size + " values: ");
				for (int i = 0; i < size; i++) {
					arr[i] = sc.nextInt();
				}
					System.out.println("----------------------------------------------------------");
					System.out.println("\nGiven:  "+Arrays.toString(arr) + "\n");
					System.out.println("Steps by steps:\n");
					insertion(arr);
					System.out.print("\nAfter sort:\n");
					System.out.print("\n\t"+ Arrays.toString(arr));
					System.out.println();
				break;

			case 3:
				System.out.print("Enter " + size + " values: ");
				for (int i = 0; i < size; i++) {
					arr[i] = sc.nextInt();
				}
					System.out.println("----------------------------------------------------------");
					System.out.println("\nGiven:  "+Arrays.toString(arr)+"\n");
					System.out.println("Steps by steps:\n");
					selection(arr);
					System.out.print("\nAfter sort:\n");
					System.out.print("\n\t"+ Arrays.toString(arr));
					System.out.println();
				break;
			case 4:
					System.out.println("Exiting program....");
					exit();
				break;
			default:
					System.out.println("Select from 1-4....");
				break;
			}
		} while (option != 4);
		
	}
	
	
	public static int[] selection(int [] arr) {
		
	
		 for (int i = 0; i < arr.length - 1; i++){  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j; 
	                }  
	            }  
	            int smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber; 
	            System.out.println("\t"+Arrays.toString(arr));
	        }  	
		return arr;
	}

		
	public static int[] insertion(int[]arr) {
		
		int key, temp = 0;
		
		for(int i = 0;i<arr.length; i++) {
			key = arr[i];
			int j = i-1;
			while((j> -1) && (arr[j] > key)) {
				temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1] = temp;
				j--;
			}
			
			System.out.print("\t"+ Arrays.toString(arr));
			System.out.println();
		}
		return arr;
	}
			
		
		static void printMenu() {
			System.out.println("\n\tMENU");
			System.out.println("\t1.Bubble");
			System.out.println("\t2.Insertion");
			System.out.println("\t3.Selection");
			System.out.println("\t4.Exit");
		}
	
		
		static void exit() {
			System.out.println("\n");
			System.out.println("# =========================================================================== #");		
			System.out.println("|                   2022 @ Sharon Grace T. Hangaan                            |");
			System.out.println("|             Follow me in: https://github.com/SG-Hangaan                     |");
			System.out.println("|                  Email: sharonygracehangaan@gmail.com                       |");
			System.out.println("# =========================================================================== #");	
		}
	}