// **search the given ele x in arr .if present so return index else return-1 
//**  input: arr[]={1,5,3} , x=5 ,o/p=1


import java.util.Scanner;

// class Find()
public class Find_ele {
  public static void main(String[] args) {
    int n;
   Scanner sc=new Scanner(System.in);
    System.out.println("Enetr the size of arr:");
    n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter ele in arr:");
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
    }

    System.out.println("Enter your ele which you want to find");
    int x = sc.nextInt();
    int index = -1;
    for(int i = 0; i < n; i++) {
      if(arr[i] == x) {
        index = i;
        break;
      }
    }
    System.out.println(index);
  }
}
