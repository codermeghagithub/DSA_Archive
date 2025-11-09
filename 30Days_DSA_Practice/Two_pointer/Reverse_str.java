import java.util.Scanner;

public class Reverse_str {
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
     System.out.print("Enter any string: ");
     String str=sc.nextLine();
     char[] s=str.toCharArray();

    int i=0;
    int j=s.length-1;
    while(i<=j){
      int temp=s[i];
      s[i]=s[j];
      s[j]=s[temp];
      i++;
      j--;

    }
    System.out.println("Reverse String is :"+new String(s));

  }
}
