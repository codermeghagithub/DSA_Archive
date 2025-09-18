// import java.util.Scanner;

// public class Prefix_sum_arr {
//   static void Printarr(int[] Pre_arr)
// {
//   int n= Pre_arr.length;
//     for (int i = 0; i < n; i++) {
//     System.out.println(Pre_arr[i]);
// }
// }

// static int[] Prefix_arr(int[] arr){
//     int n= arr.length;
//     int[] prefix=new int[n];
//     prefix[0]=arr[0];
//     for(int i=0;i<n;i++){
//       prefix[i]=prefix[i-1]+arr[i];
//     }
//     return prefix;

// }
//   public static void main(String[] args){
//    Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the size:");

//     int n=sc.nextInt();
//     int[] arr=new int[n];

//     System.out.println("Enter ele in arr:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
// }}


// ** GIVEN AN INT ARR 'A' RETURN THE PREFIX SUM/RUNNING SUM IN THE SAME ARRAY WITHOUT CREATING NEW OR ANOTHER ARR 

// import java.util.Scanner;

// public class Prefix_sum_arr {
//   static void Printarr(int[] arr)
// {
//   int n= arr.length;
//     for (int i = 0; i < n; i++) {
//     System.out.println(arr[i]);
// }
// }

// static int[] Prefix_arr(int[] arr){
//     int n= arr.length;
//     int[] prefix=new int[n];
//     prefix[0]=arr[0];
//     for(int i=1;i<n;i++){
//       prefix[i]=prefix[i-1]+arr[i];
//     }
//     return prefix;

// }
//   public static void main(String[] args){
//    Scanner sc=new Scanner(System.in);
//     System.out.println("Enter the size:");

//     int n=sc.nextInt();
//     int[] arr=new int[n];

//     System.out.println("Enter ele in arr:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         System.out.println(" ele in arr are :");
//         Printarr(arr);
//         System.out.println(" After PSUM_arr's ele in arr are :");
//         int[] prefix=Prefix_arr(arr);
//         Printarr(prefix);
        
        
// }}




// * MORE OPTIMIZE WAY
//  **Time Complexity: O(n) - optimal, can't do better
// **Space Complexity: O(1) - optimal for in-place requirement
import java.util.Scanner;

public class Prefix_sum_arr {
  static void Printarr(int[] arr)
{
  int n= arr.length;
    for (int i = 0; i < n; i++) {
      // here no need to do arr[0]=arr[0]  //* if i not apply this line because if i not to wrte this line it atometically keep it as it is arr[0] value  */
    System.out.println(arr[i]);
}
}

static void Prefix_arr(int[] arr){
    int n= arr.length;
      for(int i=1;i<n;i++){
      arr[i]+=arr[i-1];
    }
}
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size:");

    int n=sc.nextInt();
    int[] arr=new int[n];

    System.out.println("Enter ele in arr:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(" ele in arr are :");
        Printarr(arr);

        Prefix_arr(arr);
        System.out.print("Prefix sum array: ");
        Printarr(arr);
        
        
}}

