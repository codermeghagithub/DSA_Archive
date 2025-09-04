// * throw keyword    (ITS A NORMAL THROW CODE NOT USE TRY CATCH)
// public class Throws_throw_key{

//   public static void checkAge(int age){
//     if(age<18){
//       throw new IllegalArgumentException("Age must be 18 or older");  // *✅ Use IllegalArgumentException for bad parameters (most common)
//     }
//     System.out.println("Valid age: " + age);

//   }
//   public static void main(String[] args){
//     try {
//       checkAge(25);
//       checkAge(12);
        
//     } catch  (IllegalArgumentException e) { 
//       System.out.println("Processing:"+e.getMessage());
//     }
//   }
// }


// * Most Common Standard Exceptions to Throw:

// public class Throws_throw_key {
    
//     // 1. IllegalArgumentException - for invalid parameters
//     public static void validateNumber(int number) {
//         if (number < 0) {
//             throw new IllegalArgumentException("Number cannot be negative");
//         }
//     }
    
//     // 2. NullPointerException - for null values
//     public static void processString(String str) {
//         if (str == null) {
//             throw new NullPointerException("String cannot be null");
//         }
//     }
    
//     // 3. IllegalStateException - for invalid object state
//     public static void startEngine(boolean isOn) {
//         if (isOn) {
//             throw new IllegalStateException("Engine is already running");
//         }
//     }
    
//     // 4. UnsupportedOperationException - for unsupported operations
//     public static void deleteUser() {
//         throw new UnsupportedOperationException("Delete operation not supported");
//     }
    
//     // 5. RuntimeException - generic runtime exception
//     public static void genericError() {
//         throw new RuntimeException("Something went wrong");
//     }
    
//     public static void main(String[] args) {
        
//         // Test each exception
//         try {
//             validateNumber(-5);
//         } catch (IllegalArgumentException e) {
//             System.out.println("1. " + e.getMessage());
//         }
        
//         try {
//             processString(null);
//         } catch (NullPointerException e) {
//             System.out.println("2. " + e.getMessage());
//         }
        
//         try {
//             startEngine(true);
//         } catch (IllegalStateException e) {
//             System.out.println("3. " + e.getMessage());
//         }
        
//         try {
//             deleteUser();
//         } catch (UnsupportedOperationException e) {
//             System.out.println("4. " + e.getMessage());
//         }
        
//         try {
//             genericError();
//         } catch (RuntimeException e) {
//             System.out.println("5. " + e.getMessage());
//         }
//     }
// }


 class NegativeRediousException extends Exception{
  //  *toString() is a method that every class inherits from the base class Object.
  // *Its job is to return a string representation of the object.

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
  public static void main(String[] args) {
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


