//  ** Q: Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition.



import java.util.Scanner;

public class Even_odd {
  
  static void Print_arr(int[] arr){
    int n=arr.length; 
    System.out.println("Array:");

    for(int i=0;i<n;i++){
      System.out.println(arr[i]+" ");
    }}

    static void  Swap(int[] arr,int i,int j){
    int n=arr.length;
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    }

    static void balence_Eve_Odd(int[] arr){
     int l=0;
     int r=arr.length-1;
  while (l < r) {
    // if (arr[l] % 2 == 0) {  
    //     l++;
    // } else if (arr[r] % 2 != 0) {
    //     r--;
    // } else {
    //     Swap(arr, l, r);
    //     l++;
    //     r--;
    // }

    // *or 
    if(arr[l]%2==1 && arr[r]%2==0){
      Swap(arr, l,r);
      l++;
      r--;
    }

    if(arr[l]%2==0){
      l++;
    }
    if(arr[r]%2==1){
      r--;
    }
  }

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
        int l=0;
        int r=arr.length;
        
        
        System.out.println("BEFORE SORTING ARRAY:");
        Print_arr(arr);
        
        balence_Eve_Odd(arr);
      System.out.println("after SORTING ARRAY:");
      Print_arr(arr);
  
}
}



// **

// ⚠️ So to be very clear:

// It does not compare arr[l] and arr[r]

// It compares the indexes: l and r

// The loop stops when:

// l >= r


// i.e., when the left and right pointers meet or cross
// *