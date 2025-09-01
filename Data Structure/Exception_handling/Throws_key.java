


import java.util.Scanner;
class MyExceotion extends Exception{  // ** custom exception
  @Override
  public String toString(){
    return super.toString()+"I am toString()";
  }
  @Override
  public String getMessage(){
    return super.getMessage()+" I am getMessage()";
  }
} 
public class Throws_key {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a;
    System.out.println("Enetr the value a:");
    a=sc.nextInt();
  if(a<99){
    try{
        throw new MyExceotion();
      }
    catch(Exception e){
      System.out.println(e.getMessage());

    }
  }}
}


