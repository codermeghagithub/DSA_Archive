// ** Given a string, the task is to toggle all the characters of the string i.e to convert Upper case to Lower case and vice versa.
// **Input - PhysICS
// **Output - PHYSics

// My try
// import java.util.Scanner;
// public class Day2_Stringchallenge {
//   public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Enter your string :");
//  StringBuilder str1=new StringBuilder(sc.nextLine());
//  boolean isuppercase=true;
//   boolean islowercase=true;
//   for(int i=0;i<str1.length();i++){
//     char ch=str1.charAt(i);
//     if(Character.isUpperCase(ch)){
//     char lo=  Character.toLowerCase(ch);
//       System.out.print(lo);
//     }
//     else if(Character.isLowerCase(ch)){
//       char up=Character.toUpperCase(ch);
//       System.out.print(up);

//         }
//         else{
//           System.out.println("this is not character type");
//         }


// }
// System.out.println();
//   }}


import java.util.Scanner;
public class Day2_Stringchallenge {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter your string :");
 StringBuilder str1=new StringBuilder(sc.nextLine());
 for(int i=0;i<str1.length();i++){
 boolean flag=true;  //true means catpital
   char ch=str1.charAt(i);
  //  **A=65 and a=97 [97-65=32][ 100-68=32]
int ascii=(int)ch;

if(ascii>=97 &&ascii<=122){
  ascii-=32;
  char res=(char)ascii; //a
  // for sertting at actual position position is i and 
  str1.setCharAt(i,res);
}
else{
  ascii+=32;
  char res=(char)ascii;
  str1.setCharAt(i, res);
}
}
System.out.println(str1);
  }}


  //**Q2 ** if i have except alphabets if i having any difit ,*^ special tipe charecter so it can be printed only do previous question 


  