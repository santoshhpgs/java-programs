package com.personal.sorting;

public class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[min_idx] > arr[j])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            System.out.println("array checking..");
            printArray(arr);
        }
    }
    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        System.out.println("before sorting..");
        printArray(arr);
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
 // Prints the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
/* This code is contributed by Rajat Mishra*/


