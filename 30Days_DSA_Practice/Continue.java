//  **PRINT ALL THE VALUES btw 1 TO 50 EXCEPT FOR MULTIPLE S OF 3 

import java.util.Scanner;

public class Continue {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=1;
while(n<=50){
  if(n%3==0){
    n++;
    continue;
    
  }
  System.out.println(n);
  n++;
}

}}