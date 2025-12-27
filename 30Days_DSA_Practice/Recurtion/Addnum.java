// **given  AN INT , FIND OUT THE SUM OF IT'S DIGITS USING RECURSION.

import java.util.Scanner;

public class Addnum {

 static int  Sum_of_Digits(int n){
 if(n>=0 && n<=9){
 return n;
 }
 
int sum=  Sum_of_Digits(n/10);

  int k=n%10+sum;
  return k;

 }

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      int m=sc.nextInt();
      

      int total=Sum_of_Digits(m);
      System.out.println(total);
  }
}



















