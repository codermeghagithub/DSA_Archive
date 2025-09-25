//  **Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range of indices from 1 to r (both included).
// Note: The values of 1 and r in queries follow 1-based indexing. 1 indexing
// // ** THROUGH brute-force approach.
// // ** ⏱ So overall time complexity: O(q * n)
// // **Space Complexity=O(n)


// import java.util.Scanner;

// public class Prefix_sum2 {
//     // for printing arr 
//   static void Printarr(int[] arr,int n)
// {
//     for (int i = 1; i <= n; i++) {
//       // here no need to do arr[0]=arr[0]  //* if i not apply this line because if i not to wrte this line it atometically keep it as it is arr[0] value  */
//     System.out.println(arr[i]);
// }
// }

// static int Prefix(int[] arr,int l,int r){
// //  int n=arr.length;
//  int sum=0;
//  for(int i=l;i<=r;i++){
//      sum=sum+arr[i];
//  }
//  return sum;
// //  break;
// }
//   public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the size:");

//     int n=sc.nextInt();
//     int[] arr=new int[n+1];
//     System.out.println("Enter ele in arr:");
//         for (int i = 1; i <= n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.println(" ele in arr are :");
//         Printarr(arr,n);
//         System.out.println("Enter the number of queries : ");
//         int q=sc.nextInt();


//         for (int i = 1; i <= q; i++) {
//             System.out.print("Enter l and r (1-based indexing): ");
//             int l = sc.nextInt();
//             int r = sc.nextInt();

//             // Convert to 0-based indexing
//             int result = Prefix(arr, l,r);
//             System.out.println("Sum from " + l + " to " + r + " is: " + result);
//             // break;
//         }


//   }
// }


// ** in OPTIMIZE WAY 

import java.util.Scanner;

public class  Prefix_sum2{
    
    // Method to build prefix sum array
    static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n + 1]; // Extra space for easier calculation
        
        // prefixSum[0] = 0 (default)
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i-1];
        }
        return prefixSum;
    }
    
    // Method to answer range sum query
    static int rangeSum(int[] prefixSum, int l, int r) {
        return prefixSum[r] - prefixSum[l-1];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Build prefix sum array
        int[] prefixSum = buildPrefixSum(arr);
        
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        
        System.out.println("Enter queries (l r): ");
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            // Convert to 0-based indexing internally if needed
            int sum = rangeSum(prefixSum, l, r);
            System.out.println("Sum from " + l + " to " + r + ": " + sum);
        }
        
    }
}
