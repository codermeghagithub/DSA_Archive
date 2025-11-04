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
            // ans+=" ";
            gtr=new StringBuilder("");
          }
  }
    gtr.reverse();
        ans += gtr.toString();
         System.out.println("reverse string is :"+ans);
}}