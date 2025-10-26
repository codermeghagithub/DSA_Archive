

// **q3 . sum of all substring of a number  6759 =8421

// import java.util.Scanner;

// public class Sum_substr {
//   public static void main(String[] args){
//     int sum=0;
// Scanner sc = new Scanner(System.in);
//   System.out.print("Enter any number: ");
//    String num=sc.nextLine();
//    for(int i=0;i<num.length();i++){
//     for(int j=i+1;j<=num.length();j++){
//       String sub=num.substring(i,j);
//       int str_num=Integer.parseInt(sub);
//          sum=sum+str_num;
//     }
//    }
//    System.out.println("sum of all subString number is :"+sum);  // * O(n)2
//      }}


// **OPTIMISE

import java.util.Scanner;

public class Sum_substr {
  public static void main(String[] args){

long total=0;
long prev=0;
    Scanner sc = new Scanner(System.in);
  System.out.print("Enter any number: ");
  String num=sc.nextLine();
  for(int i=0;i<num.length();i++){
  int num2=num.charAt(i)-'0';
  long current=prev*10+(long)(i+1)*num2;
   total=total+current;
prev=current;
  // System.out.println(num2);
    
   }
   System.out.println("sum of all subString number is :"+total);  // * O(n)
     }}
