
// **FIBONACCI NUMBER

import java.util.Scanner;
public class Fibonacci {
  static int N_factorial(int m){
      int curr, pre,prep;
   if(m==0 || m==1){  // **BASE CASE
       return m;
   }
   
   else{
       // *SUBPROBLEMS 
       pre=N_factorial(m-1);
       prep=N_factorial(m-2);
       return pre+prep; //**SELF WORK */
   }  
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int m=sc.nextInt();
      
      int res=N_factorial(m);
System.out.println("Fibonacci of " + m + " is: " + res);
  }
}



