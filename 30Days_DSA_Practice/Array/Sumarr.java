// ** ⏱️ Time Complexity (TC) =>O(n) — Linear Time
// **🧠 Space Complexity (SC) => O(1) — Constant Space

import java.util.Scanner;
class Sumofarr{
  public static int calculatesum(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

}

public class Sumarr {
  public static void main(String[] args) {
    int n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter arr size:");
     n=sc.nextInt();
     int[] Sarr=new int[n];
     System.out.println("Enter all ele in arr:");
     for(int i=0;i<n;i++)
     {
       Sarr[i]=sc.nextInt();
     }
    sum=Sumofarr.calculatesum(Sarr);
       System.out.println("sum of this array:"+sum);

 }
}
