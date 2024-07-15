package Sorting.SortingTechniques.MergeQuickSortHeapSort;

public class quick 
{
	public static void sort(int[] arr)
    {
		System.out.println("\n=========== QUICK SORT ===========\n");
		System.out.println("SOLUTION\n");
		
        int[] sorted = quicksort(arr);

        System.out.println("\nGiven array:");
        arrayprinter(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        arrayprinter(sorted, 0, arr.length - 1);
    }

    private static int Partition(int[] arr, int low, int high, int pivotIndex, int indent_count)
    {
        arrayprinter(arr, low, high);

        int i = pivotIndex + 1;
        int j = high;
        int temp;
        if (!(i < j))
        {
            System.out.print(utils.repeat(" ", indent_count));
            pijprinter(arr, low, high, pivotIndex, i, j);
        }

        while (i < j)
        {
            while (i < high && arr[i] <= arr[pivotIndex])
            {
                i++;
            }
            while (j > pivotIndex + 1 && arr[j] >= arr[pivotIndex])
            {
                j--;
            }

            System.out.print(utils.repeat(" ", indent_count));
            pijprinter(arr, low, high, pivotIndex, i, j);

            if (i < j)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                System.out.print(utils.repeat(" ", indent_count));
                arrayprinter(arr, low, high);
            }
        }

        if (arr[pivotIndex] > arr[j])
        {
            temp = arr[pivotIndex];
            arr[pivotIndex] = arr[j];
            arr[j] = temp;
            pivotIndex = j;

            System.out.print(utils.repeat(" ", indent_count));
            arrayprinter(arr, low, high);
            System.out.println();
        }
        return pivotIndex;
    }

    private static void quicksort(int[] arr, int pivot_index, int low, int high, int old_pivots_index, int indent_count)
    {

        if (low < high)
        {
            int pi = Partition(arr, low, high, pivot_index, indent_count);

            if (pi > old_pivots_index + 1)
            {
                old_pivots_index = Math.min(pivot_index, old_pivots_index);
                System.out.print(utils.repeat(" ", indent_count) + "L: ");
                quicksort(arr, old_pivots_index + 1, low, pi - 1, old_pivots_index, indent_count + 3);
            }
            else if (low < pi - 1)
            {
                System.out.print(utils.repeat(" ", indent_count) + "L: ");
                arrayprinter(arr, low, old_pivots_index);

                System.out.print(utils.repeat(" ", indent_count + 3));
                pijprinter(arr, low, old_pivots_index, old_pivots_index, old_pivots_index + 1, old_pivots_index + 1);
            }

            if (pi < high)
            {
                System.out.print(utils.repeat(" ", indent_count) + "R: ");
                quicksort(arr, pi + 1, pi, high, pi, indent_count + 3);
            }
            else if (high - low > 1)
            {
                System.out.print(utils.repeat(" ", indent_count) + "R: ");
                arrayprinter(arr, pi, high);
                System.out.println();
            }
        }
        else
        {
            arrayprinter(arr, low, high);
            System.out.print(utils.repeat(" ", indent_count));
            pijprinter(arr, low, high, pivot_index, pivot_index + 1, pivot_index + 1);
        }

    }

    private static int[] quicksort(int[] arr)
    {
        int n = arr.length;

        int[] copy = new int[n];
        for (int i = 0; i < n; i++)
        {
            copy[i] = arr[i];
        }

        quicksort(copy, 0, 0, n - 1, -1, 0);

        arrayprinter(copy, 0, n - 1);
        return copy;
    }

    private static void arrayprinter(int[] array, int low, int high)
    {
        for (int i = low; i <= high; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    private static void pijprinter(int[] array, int low, int high, int p, int i, int j)
    {
        for (int k = low; k <= high; k++)
        {
            int leng = ("" + array[k]).length();

            if (k == p)
                System.out.print(utils.repeat(" ", leng - 1) + "P ");
            else if (k == i && k == j)
                System.out.print(utils.repeat(" ", leng - 1) + "ij ");
            else if (k == i)
                System.out.print(utils.repeat(" ", leng - 1) + "i ");
            else if (k == j)
                System.out.print(utils.repeat(" ", leng - 1) + "j ");
            else
            {
                System.out.print(utils.repeat(" ", (leng + 1)));
            }
        }
        System.out.println("\n");
    }
}
