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


import java.util.Scanner;

public class Prefix_sum_arr {
  static void Printarr(int[] arr)
{
  int n= arr.length;
    for (int i = 0; i < n; i++) {
    System.out.println(arr[i]);
}
}

static int[] Prefix_arr(int[] arr){
    int n= arr.length;
    int[] prefix=new int[n];
    prefix[0]=arr[0];
    for(int i=1;i<n;i++){
      prefix[i]=prefix[i-1]+arr[i];
    }
    return prefix;

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
        System.out.println(" After PSUM_arr's ele in arr are :");
        int[] prefix=Prefix_arr(arr);
        Printarr(prefix);
        
        
}}
