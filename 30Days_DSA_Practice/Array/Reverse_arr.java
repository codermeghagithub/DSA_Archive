// import java.util.Scanner;
// public class Reverse_arr {

//     static void Rev_arr(int arr[]) {
//         int len = arr.length;
//         int[] new_arr=new int[len];

//         // System.out.print("Reversed array: ");
//         //  *traverse original arr in reverse derection 
//         for (int i = len - 1,k=0; i >= 0; i--,k++) {
//           new_arr[k]=arr[i];
//         }
//         for(int j=0;j<new_arr.length;j++){
//           System.out.print("reverse arr is:"+new_arr[j]+" ");
//         }
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n;
//         System.out.print("Enter size of array: ");
//         n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter ele in arr:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         for (int i = 0; i < n; i++) {

//             System.out.println("ele of the arr:" + arr[i]);
//         }
//         Rev_arr(arr);
//     }
// }


// **this one is better 
// import java.util.Scanner;
// public class Reverse_arr {


// static void printarr(int new_arr[])
// {
//     for(int i=0;i<new_arr.length;i++)
// {
//     System.out.print(new_arr[i]+" ");
// }}

// static int[] Rev_arr(int arr[]) {
//         int len = arr.length;
//         int[] new_arr=new int[len];

//         // System.out.print("Reversed array: ");
//         //  *traverse original arr in reverse derection 
//         // int k = 0;// **using for loop
//         // for (int i = len - 1; i >= 0; i--) {
//         //   new_arr[k++]=arr[i];
//         // }

//         int i=len-1,k=0;
//         while(i>=0){
//             i++;
//             new_arr[k++]=arr[i--];
//         }
//         return new_arr;
//     }

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n;
//         System.out.print("Enter size of array: ");
//         n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter ele in arr:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         // for (int i = 0; i < n; i++) {

//         //     System.out.println("ele of the arr:" + arr[i]);
//         // }
//         int[] new_arr=Rev_arr(arr);
//         printarr(new_arr);

//     }
    
// }


// ** better optimize way

import java.util.Scanner;
public class Reverse_arr {
static void Swaparr(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

static void Rarr(int[] arr){
    int i=0,j=arr.length-1;
    while(i<j){
        Swaparr(arr, i, j);
        i++;
        j--;
    }
}
static void printarr(int arr[])
{
    for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+" ");
}}

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
        // for (int i = 0; i < n; i++) {

        //     System.out.println("ele of the arr:" + arr[i]);
        // }
        Rarr(arr);
        
   
//     for(int i=0;i<arr.length;i++)
// {
//     System.out.print(arr[i]+" ");
// }
        printarr(arr);
    }
    
}


