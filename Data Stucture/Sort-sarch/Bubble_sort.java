
import java.util.Scanner;

public class Bubble_sort {

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the size of arr:");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter ele in arr:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("Length: " + arr.length);
        // ** Check before sorting
        if (isSorted(arr)) {
            System.out.println("Array is already sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {  // **check inside bubble sort to stop unnecessary extra passes.  if we not write it's fine but this line make this code optimize 
                break;   //**stop is alread sorted

                    }}
        // **Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
