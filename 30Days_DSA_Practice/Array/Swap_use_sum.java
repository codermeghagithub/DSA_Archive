// **Swap witheout third var


import java.util.Scanner;

public class Swap_use_sum {

  static void Swapwith_sum(int a,int b){
     System.out.println("orginal value is a="+a);
    System.out.println("orginal value is b="+b);
    a=a+b;
    b=a-b;
    a=a-b;
 System.out.println(" value after swap is a="+a);
    System.out.println(" value after swap is b="+b);  }
    
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter 1st and 2nd  ele: ");
    int a;
    int b;
    a=sc.nextInt();
    b=sc.nextInt();
   
    
      Swapwith_sum(a,b);
  }
}
