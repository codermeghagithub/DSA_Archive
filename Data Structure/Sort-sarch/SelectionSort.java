import java.util.Scanner;


    // **
    //  * Performs selection sort on the given array
    //  * Time Complexity: O(n²)
    //  * Space Complexity: O(1)
    //  *

public class SelectionSort {
    
    // Optimized Selection Sort with early termination check
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;  // Better variable name than minval
            
            // Find minimum element in remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Only swap if needed (small optimization)
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    
    // Enhanced version with early termination for nearly sorted arrays
    public static void selectionSortOptimized(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            // Find minimum element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // If minimum is already at correct position, continue
            if (minIndex == i) {
                continue;  // No swap needed
            }
            
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    
    // Check if array is already sorted (optional optimization)
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    // Print array method
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter elements in array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Original Array:");
        printArray(arr);
        
        // Optional: Check if already sorted
        if (isSorted(arr)) {
            System.out.println("Array is already sorted!");
        } else {
            System.out.println("Sorting array...");
            selectionSort(arr);
        }
        
        System.out.println("Sorted Array:");
        printArray(arr);
        
    }
}