import java.util.Scanner;
public class T_pointer1 {

  static void Printarr(int[] arr){
    int n=arr.length;
    System.out.println("ARRAY:");
    // ** 1 0 0 1 0 1 1 0 0  => 0 0 0 0 0 1 1 1 1 
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }}
     
  static void sortZerosandOne(int[] arr){
  
    // **count  zero 
int n=arr.length;
int count=0;
for(int i=0;i<n;i++){
  if(arr[i]==0){
    count++;
  }}
System.out.println("Number of 1s in the array: " + count);

    // * arrange zero 1to n 
    for (int i=0;i<n;i++){
      if(i<count){
        arr[i]=0;
      }
      else{
        arr[i]=1;
      }
    }
    // Swap_nums(arr, n, n);


  }      
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the size:");
    n =sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter ele in arr:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("BEFORE SORTING ARRAY:");
        Printarr(arr);
        sortZerosandOne(arr);
       System.out.println("after SORTING ARRAY:");
       Printarr(arr);
  }
}
