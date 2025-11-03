
import java.util.Scanner;

public class Pallindrome {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    String str1=sc.nextLine();
    StringBuilder gtr=new StringBuilder(str1);
    boolean flag=true;
    int count=0;
    int i=0;
    int j=gtr.length()-1;
        while(i<j){
          if(gtr.charAt(i)!=gtr.charAt(j)){
            flag=false;
            break;
          }
          i++;
        j--;}
          if(flag==true){
System.out.println("String is palidrome");
// count++;
          }
          else{
            System.out.println("Not Pallindrome");
          }
        
        System.out.println("Count="+count);
  }}
  

