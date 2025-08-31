// **
// public class Basic {
//   public static void main(String[] args) {
//   try {
//       //code that may raise exception    
//    int data=24/0;

//   }catch(ArithmeticException e){
//     System.out.println(e);
//   }
//   //rest code of the program     
//    System.out.println("rest of the code...");}
// }

// **
// public class Basic {
//     public static void main(String[] args) {
//         try {
//             // Risky code that might throw an exception
//             int[] numbers = {1, 2, 3};
//             System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
//         } catch (ArrayIndexOutOfBoundsException e) {
//             // Handle the specific exception
//             System.out.println("Array index is out of bounds!");
//             System.out.println("Error message: " + e.getMessage());
//         }
        
//         System.out.println("Program continues executing...");
//     }
// }

// **
public class Basic{
  public static void main(String[] args) {
    try {
        String str=null;
        int length=str.length(); //** NullPointerException

        int result = 10 / 0; // ArithmeticException  
        int[] arr=new int[5];
        arr[10]=20; // ArrayIndexOutOfBoundsException

          } catch (NullPointerException e) {
            System.out.println("Null pointer exception occurred: " +e.getMessage());
    }
    catch (ArithmeticException e){
      System.out.println("Arithmetic exception occurred: " + e.getMessage());
    }
  catch (ArrayIndexOutOfBoundsException e) {
     System.out.println("Array index out of bounds: " + e.getMessage());
  } 
  catch (Exception e) {
            // Generic catch block - should be last
            System.out.println("Some other exception occurred: " + e.getMessage());

  }}
}