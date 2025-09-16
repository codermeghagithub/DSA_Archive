import java.util.Scanner;

public class BubbleSort {
    
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no swapping occurred, array is sorted
            if (!swapped) {
                break;
            }
        }
    }
    
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
        
        
        System.out.println("Original array:");
        printArray(arr);
        
        // Check if already sorted
        if (isSorted(arr)) {
            System.out.println("Array is already sorted.");
        } else {
            System.out.println("Array is not sorted. Sorting...");
            bubbleSort(arr);
        }
        
        System.out.println("Sorted array:");
        printArray(arr);
        
        sc.close();
    }
}