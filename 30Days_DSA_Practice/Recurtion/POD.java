
// * 2. num p &q find the value p^q using a recursive function.

import java.util.Scanner;
public class POD {
  static int Power_of_Digit(int p,int q){
    if(q==0){
      return 1; 
    }
    // int k=pow(p,q);
    int res=Power_of_Digit(p,q-1);
return res;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
          int p=sc.nextInt();
      System.out.println("Enter the number:");
          int q=sc.nextInt();  
          
     int res= Power_of_Digit(p,q);    
System.out.println("Power of x^y :"+res);
  }
  
}

