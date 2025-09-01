// * throw keyword  
 class NegativeRediousException extends Exception{

  @Override
  public String toString(){
    return "Radious  cannot be nagative !";

  }
  @Override
  public String getMessage(){
  return "I am getMessage";
}
}


public class Throws_throw_key {
  public static double area(int r) throws NegativeRediousException{

    if(r<0){
      
      throw new NegativeRediousException();
    }
  double result =Math.PI*r*r;  // * if i provide nagative value so i use throw  
  return result;
  }

  // public static int divide(int a,int b) throws ArithmeticException{  // *use throws keyword
  //     int result=a/b;
  //     return result;
      
  //   }

  public static void main(String[] args) {
  //   try{
  // int c =divide(34,0);
  // System.out.println(c);
    // }
    
    try {
    double ar=area(5);
    System.out.println(ar);
    } 
    catch(Exception e){
      System.out.println("It gives exception error"+e.getMessage());
    }


  }}





  // public class Throws_throw_key {
  
  // public static int divide(int a,int b) throws ArithmeticException{  // *use throws keyword
  //     int result=a/b;
  //     return result;
      
  //   }

  // public static void main(String[] args) {
  //   try{
  // int c =divide(34,0);
  // System.out.println(c);
  //   }catch(Exception e){
  //     System.out.println("It gives exception error"+e.getMessage());
  //   }

  // }}


// import java.util.Scanner;
// class MyExceotion extends Exception{  // ** custom exception
//   @Override
//   public String toString(){
//     return super.toString()+"I am toString()";
//   }
//   @Override
//   public String getMessage(){
//     return super.getMessage()+" I am getMessage()";
//   }
// } 
// public class Throws_throw_key {
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int a;
//     System.out.println("Enetr the value a:");
//     a=sc.nextInt();
//   if(a<99){
//     try{
//         throw new MyExceotion();
//       }
//     catch(Exception e){
//       System.out.println(e.getMessage());

//     }
//   }}
// }


