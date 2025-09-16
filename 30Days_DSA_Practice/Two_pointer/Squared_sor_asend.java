// **Given an integer array 'a' sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order


import java.util.Scanner;
public class Squared_sor_asend {
   // **swaping ele  
  static void  Swap(int[] arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
        
  } 
  // **after the first call to Swap(), the program automatically goes back into Reverse_arr, updates i and j, and if the loop is still true, it calls Swap() again.
  
static void Reverse_arr(int[] arr){
int i=0,j=arr.length-1;
while(i<j){
  Swap(arr, i, j);
  i++;
  j--;
}
}

static int[]  square(int[] arr){
  int n=arr.length;
  int left=0;
  int right=n-1;
  int[] new_arr=new int[n];
 int k=0;
 
    while(left<=right){

      if(Math.abs(arr[left])>Math.abs(arr[right])){
        new_arr[k]=arr[left]*arr[left];
        k++;
        left++;
      }
      else{
        new_arr[k]=arr[right]*arr[right];
        k++;
        right--;
      }
    }

    return new_arr;

  }

  static void printarr(int arr[])
{
    for(int i=0;i<arr.length;i++)
{
    System.out.print(arr[i]+" ");
}}


  public static void main(String[] args){
    int size;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array : ");
    size=sc.nextInt();
    int[] arr=new int[size];
    System.out.println("Enter elements of array: ");
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Before squared sorted arr :");
    printarr(arr);
    int[] new_arr=square(arr);
  
    System.out.println("Before squared sorted arr :");
    Reverse_arr(new_arr);
       printarr(new_arr);
    }
    }

