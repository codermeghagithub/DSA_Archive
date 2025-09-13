import java.util.Scanner;

public class InsertionSort {
  
public static void Insertion(int[] arr)
{
  int n=arr.length;
  for(int i=1;i<n;i++){
   int j=i;
   while(j>0 && arr[j]<arr[j-1]){
int temp=arr[j];
arr[j]=arr[j-1];
arr[j-1]=temp;
j--;
   }
  }
}
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
         if (isSorted(arr)) {
            System.out.println("Array is already sorted!");
        } else {
            System.out.println("Sorting array...");
           Insertion(arr);
        }
        
        System.out.println("Sorted Array:");
        printArray(arr);
        
}
}