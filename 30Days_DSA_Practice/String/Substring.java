// *q1 / ** input  s="abcd"
//**  o/p=a ab abc abcd b bc bcd c cd d

import java.util.Scanner;

public class Substring {
  public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  System.out.print("Enter your name: ");
  String s=sc.nextLine();
  for(int i=0;i<s.length();i++){
    for(int j=i+1;j<=s.length();j++){
    System.out.print(s.substring(i,j)+" ");
  }
  }}
}
