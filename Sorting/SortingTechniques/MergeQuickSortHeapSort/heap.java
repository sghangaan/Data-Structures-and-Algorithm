package Sorting.SortingTechniques.MergeQuickSortHeapSort;

import java.util.Arrays;
public class heap {
	public static String solution = "";

    public static void sort(int[] array)
    {
    	System.out.println("\n=========== HEAP  SORT ===========\n");
		System.out.println("SOLUTION\n");
    	
        int[] sorted = heap_sort(array);

        System.out.println("Solutions:\n" + solution);

        System.out.println("Orig: " + Arrays.toString(array));
        System.out.println("Sorted: " + Arrays.toString(sorted));
    }

    public static int[] heap_sort(int[] array)
    {
        int arrSize = array.length;

        // copy the array
        int[] copy = new int[arrSize];
        for (int i = 0; i < arrSize; i++)
        {
            copy[i] = array[i];
        }

        // step 1 - convert to binary heap
        System.out.println("\nStart converting to binary heap");
        print_binary_tree(copy, arrSize);
        solution += Arrays.toString(copy) + "\n";
        System.out.println();

        // step 2 - convert to max heap
        Maxheap(copy, arrSize);
        System.out.println("\nDone converting binary tree to max heap" +
                            "\nFinal Heap tree");
        print_binary_tree(copy, arrSize);
        solution += Arrays.toString(copy) + "\n";
        System.out.println();

        System.out.println("\nStart doing heapify");
        // step 3: delete the root element from the max heap using the heapify method
        Heapify(copy, arrSize-1);

        return copy;
    }


    public static void Maxheap(int[] array, int arrSize)
    {
        // calculate count ng lahat ng may anak
        int max = arrSize / 2 - 1;

        // start from top node, and upto dun sa huling may anak pa
        for (int current = 0; current <= max ; current++)
            // check natin kung tamang heap subtree sya
            check_subtree(array, arrSize, current);
    }
    public static void check_subtree(int [] array,int arrSize, int i)
    {
        // current index should be the biggest
        // so we temporary assign it to big
        int big = i;

        // calculate the left and right children indexes
        int left = 2 * i + 1;
        int right = left+1;

        // check the bigest among left and right
            if (left < arrSize && array[left] > array[big]){
                big = left;
            }
            if (right < arrSize && array[right] > array[big])
            {
                big = right;
            }

        // if there is a new bigger value
        if (big != i)
        {
            // we swap that with the current index
            int swap = array[i];
            array[i] = array[big];
            array[big] = swap;

            System.out.println("\nSwapped index " + i + " and index " + big);
            print_binary_tree(array, arrSize);
            System.out.println();

            // then we calculate the parent node
            int parent = (i % 2 == 0) ? (i - 2) / 2 : (i - 1) / 2;

            // if hindi pa lampas sa tuktok
            if (parent >= 0) {
                // check the parent kung tama syang heap
                check_subtree(array, arrSize, parent);
            }

            // if may anak ung current index
            if (2 * big + 1 < arrSize)
            {
                // if check din natin sya
                check_subtree(array, arrSize, big);
            }
        }
    }

    public static void printArray(int arr[], int arrSize)
    {
        // print the each element of the array
        for (int i = 0; i < arrSize; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // heapify moves the root of the tree to the sorted right side
    public static void Heapify(int [] array, int i)
    {
        // if the max heap is empty, then exit
        if (i == 0)
        {
            // finally, removed the last remaining element
            System.out.println("Finally, Removed " + array[0] + ", and heap sort is finished\n");
            return ;
        }

        // step 4: moves the root of the tree to the sorted right side
        int temp = array[0];
        array[0] = array[i];
        array[i] = temp;

        System.out.println("\nRemoved " + temp + " and placed " + array[0] + " into the root position\n");
        print_binary_tree(array, i);
        solution += Arrays.toString(array) + "\n";
        System.out.println();

        // make sure the tree is a proper heap tree
        check_subtree(array, i,0);
        solution += Arrays.toString(array) + "\n";

        // step 5: repeat the same until max heap becomes empty
        Heapify(array, i - 1);
    }

    // print tree
    // pattern

    // left part
    //5s 2s
    //7  7 " (5) 2  (5) 2  (5) 2  (5) 2  (5) 2  (5) 2  (5) 2 -2147483647\n" +
    //4  3 " (5) 2  (5) 2  (5) 2  (5) ╔═══════════════════════════╩═══════════════════════════╗\n" +
    //3  3 " (5) 2  (5) 2  (5) 2 -2147483647 2  (5) 2 (5)  2 (5) (3) (5) 2  (5) 2  (5) 2 -2147483647\n" +
    //2  1 " (5) 2  (5) ╔═════════════╩═════════════╗ (5)  2 (5) (3) (5) 2  (5) ╔═════════════╩═════════════╗\n" +
    //1  1 " (5) 2 -2147483647 2 (5) (3) (5) 2 -2147483647 2 (5) (3) (5) 2 -2147483647 2 (5) (3) (5) 2 -2147483647\n" +
    //1  0 " (5) ╔══════╩══════╗ (5) (3) (5) ╔══════╩══════╗ (5) (3) (5) ╔══════╩══════╗ (5) (3) (5) ╔══════╩══════╗\n" +
    //0  0 "-2147483647   -2147483647   -2147483647   -2147483647   -2147483647   -2147483647   -2147483647   -2147483647"

    public static void print_binary_tree(int[] array, int n)
    {
        // get the levels count
        int levels = tree_height(array, n);

        // get the count of max nodes possible at a given level
        int max_nodes = max_nodes_counter(levels);

        // get the longest digit length (including negative sign)
        int longest_digit = longest_counter(array, n);

        // i want the length to be odd, for easier centering of branches
        if (longest_digit % 2 == 0)
            longest_digit++;

        // get half of the longest digit round down to nearest whole number
        int half_longest_digit = longest_digit / 2;

        // some variables for later use
        int index = 0;
        int num_spaces;

        // iterate through levels from top to bottom, from level 1 and so on
        for (int i = 1; i <= levels; i++)
        {
            // count the number of elements (numbers) per level with formula
            int num_element_at_current_level = (int) Math.pow(2, (i - 1));

            // the number of spaces need is based on the max node and the current level
            // steps are:
            // step 1: start with (max_nodes - 1)
            // step 2: max_nodes / 2
            // step 3: max_nodes - 1
            // step 4: repeat from step 2 until we finish the levels

            max_nodes--;

            // printing the numbers of the array
                // formula for num_spaces for numbers row
                num_spaces = (max_nodes / 2) * (half_longest_digit + 2);

                // loop the printing of numbers based on how_many numbers at a current level
                for (int j = 0; j < num_element_at_current_level && index < n; j++)
                {
                    // (spaces)number(spaces + 3)
                    System.out.print(repeat(" ", num_spaces) +
                                     center_this((array[index] + ""), longest_digit) +
                                     repeat(" ", num_spaces + 3));
                    index++;
                }
                System.out.println();

            // count the estimated remaining branches based on remaining elements
            int remaining_elements = n - index;
            int estimated_remaining_branches = (remaining_elements + 1) / 2;

            // if we are at the final level, then stop because we wont need the next branches
            if (i == levels)
                break;

            max_nodes /= 2;

            // printing the tree branches
                // formula for num_spaces for branches row
                num_spaces = (max_nodes / 2) * (half_longest_digit + 2) + half_longest_digit;

                // loop the printing of branches based on how_many numbers at the previous row
                for (int j = 0; j < num_element_at_current_level; j++)
                {
                	// (spaces)╔(═ signs)═╩═(═ signs)╗(spaces)
                	System.out.print(repeat(" ", num_spaces) +
                            		"╔" +
		                            repeat("═", num_spaces) +
		                            "═╩═" +
		                            repeat("═", num_spaces) +
		                            "╗" +
		                            repeat(" ", num_spaces + 3));

                    estimated_remaining_branches--;
                    // if the we have reached 0 remaining branches, then stop
                    if (estimated_remaining_branches == 0)
                        break;
                }
                System.out.println();
        }
    }

    public static int tree_height(int[] arr, int n)
    {
        int count = 0;

        // start at the root
        int index = 0;

        // sagarin ung left childs, para mabilang ung levels

            // while index is still valid
            while (index < n)
            {
                count++;

                // go to that left child of the current index
                index = 2 * index + 1;
            }
        return count;
    }

    public static int longest_counter(int[] arr, int n)
    {
        int longest = 0;

        // checkk all the numbers of the array
        for (int num: arr)
        {
            // check the number length as a string
            int current_length = ("" + num).length();

            // if its longer,
            if (current_length > longest)
            {
                // then its will be the longest
                longest = current_length;
            }
        }
        return longest;
    }

    public static int max_nodes_counter(int height)
    {
        return (int) (Math.pow(2, height) - 1);

        /*int max = 0;

        // sagarin ung right childs, para mabilang ung max_nodes

            // loop through all the levels - 1
            for (int i = 0; i < levels - 1; i++)
            {
                // go to the right child index
                max = 2 * max + 2;
            }

        // since index sya, need plus 1 para sa count
        return max + 1;*/
    }


    public static String repeat(String str, int count)
    {
        // create a char (count) times, then replace all of them with the given string
        return new String(new char[count]).replace("\0", str);
    }

    public static String center_this(String str, int num_limit)
    {
        // check the difference of the two
        int diff = (num_limit - str.length());
        int diff_divide_two = diff / 2;

        // (spaces) str (spaces)
        String template = repeat(" ", diff_divide_two) + str + repeat(" ", diff_divide_two);

        // if the diff is odd, then add a space in beginning
        if (diff % 2 == 1)
        {
            template = " " + template;
        }
        return template;
    }
}
