// **JAVA  PROGRAM TO REVERSE EACH WORD IN STRING .
// *i/P= i am an educator
// * o/p=> i ma na rotacude 

// import java.util.Scanner;
// public class Day_4 {
//   public static void main (String []args){
//       Scanner sc =new Scanner(System.in);
//         String str1;
//         int count=0 ;
//           System.out.print("Enter any string: ");
//          str1=sc.nextLine();
//          StringBuilder gtr=new StringBuilder(str1);
//          StringBuilder rev=gtr.reverse();
//          System.out.println("Reverse String is :"+rev);
//   }
// }
import java.util.Scanner;
public class Day_4 {
  public static void main (String []args){
      Scanner sc =new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str1;
        String ans ="";
         str1=sc.nextLine();
         StringBuilder gtr=new StringBuilder();
        for(int i=0;i<str1.length();i++){
          char ch=str1.charAt(i);
          if(ch!=' '){
          gtr.append(ch);
          }
          else{
            gtr.reverse();
            ans+=gtr.toString()+" ";
            gtr=new StringBuilder("");
          }
  }
    gtr.reverse();
        ans += gtr.toString();
         System.out.println("reverse string is :"+ans);
}}



// Optimize way Time Complexity:O(n)  & Space Complexity:O(n)
// class Solution {
//     public String reverseWords(String s) {
// StringBuilder sb=new StringBuilder();
// StringBuilder res=new StringBuilder();
// for(char ch:s.toCharArray()){
//     if(ch!=' '){
//         sb.append(ch);
//     }
//     else{
//         res.append(sb.reverse());
//         res.append(' ');
//         sb.setLength(0) ;//syntax: sb.setLength(0)
//     }}
//     res.append(sb.reverse());
//     return res.toString();
//     }}

// 2nd one and 3rd one TC and space complexity are same 
// **⭐ Even Shorter Clean Solution
// class Solution {
//     public String reverseWords(String s) {
//         StringBuilder sb = new StringBuilder();
//         int start = 0;

//         for (int i = 0; i <= s.length(); i++) {
//             if (i == s.length() || s.charAt(i) == ' ') {
//                 for (int j = i - 1; j >= start; j--) {
//                     sb.append(s.charAt(j));
//                 }
//                 if (i < s.length()) sb.append(' ');
//                 start = i + 1;
//             }
//         }
//         return sb.toString();
//     }
// }
