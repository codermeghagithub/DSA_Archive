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


// this one is better 
import java.util.Scanner;
public class Reverse_arr {


static void printarr(int new_arr[])
{
    for(int i=0;i<new_arr.length;i++)
{
    System.out.print(new_arr[i]+" ");
}    
    
}

static int[] Rev_arr(int arr[]) {
        int len = arr.length;
        int[] new_arr=new int[len];

        // System.out.print("Reversed array: ");
        //  *traverse original arr in reverse derection 
        int k = 0;
        for (int i = len - 1; i >= 0; i--) {
          new_arr[k++]=arr[i];
        }
        return new_arr;
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
        // for (int i = 0; i < n; i++) {

        //     System.out.println("ele of the arr:" + arr[i]);
        // }
        int[] new_arr=Rev_arr(arr);
        printarr(new_arr);

    }
    
}
