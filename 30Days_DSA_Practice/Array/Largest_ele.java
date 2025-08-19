import java.util.Scanner;
public class Largest_ele{
public static void main(String[] args){
    int n;
   Scanner sc=new Scanner(System.in);
    System.out.println("Enetr the size of arr:");
    n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter ele in arr:");
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
    }
  

    int largest=arr[0];
    for(int j=0;j<n;j++){
    if(arr[j]>largest){
    largest=arr[j];
    }
  }
  System.out.println("the largest ele of array:"+largest);
}}


