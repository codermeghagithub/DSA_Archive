// **Rotated the given array 'a'by k steps where k is non-nagative .


// import java.util.Scanner;

// public class Rotated_arr {
//     // 
// static void printArray(int[] ans){
// for(int i=0;i<ans.length;i++)
// {
//     System.out.print(ans[i]+" ");
// }}
//     // 

// static int[] Rotate(int[] arr,int k){
//   int n=arr.length;
//   k=k%n;
//   int[] ans=new int[n];
// int j=0;
// for(int i=(n-k);i<=n-1;i++){
//   ans[j++]=arr[i];

// }

// for(int i=0;i<=(n-k-1);i++){
//   ans[j++]=arr[i];
// }
// return ans;
// }


//   public static void main(String[] args) {
      
//         Scanner sc = new Scanner(System.in);
//         int n;
//         System.out.print("Enter size of array: ");
//         n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter ele in arr:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int k;
//         System.out.print("Enter the k value : ");
//         k = sc.nextInt();
        
//          System.out.println(" ele in arr:");
//         for (int i = 0; i < n; i++) {
//             System.out.println(arr[i]);
//         }
//     System.out.println("Original arr is :");
//      printArray(arr);
//          System.out.println("After rotation  arr is :");

//        int[] ans= Rotate(arr,k);
//        printArray(ans);
//   }
  
// }


// **without taking extra sPace means whout taking extra array 
import java.util.*;
 public class Rotated_arr {
    
static void printArray(int[] arr){
for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+" ");
}}

static void Rotate(int[] arr,int k){
  int n=arr.length;
  Reverse(arr,0,n-k-1);
  Reverse(arr,n-k,n-1);
  Reverse(arr,0,n-1);
}

static void Swaparr(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

static void Reverse(int[] arr,int i,int j){
    while(i<j){
        Swaparr(arr, i, j);
        i++;
        j--;
    }
}

 public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter ele in arr:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k;
        System.out.print("Enter the k value : ");
        k = sc.nextInt();
        
         System.out.println("Ele in arr:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        

         System.out.println("After rotation  arr is :");

       Rotate(arr, k);
       printArray(arr);

  }
  
}
 
