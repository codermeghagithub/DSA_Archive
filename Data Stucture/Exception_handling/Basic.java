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

// ** 2. Multiple Catch Blocks
import java.util.Scanner;
public class Basic{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  try {
    // * NullPointerException
  System.out.println("Enter a string (or press Enter to test  NullPointerException):");
    String input = sc.nextLine();
    String str=input.isEmpty() ?null:input; //  *make it null if user enters nothing
    int length=str.length();  // *will throw NPE if str is null
    System.out.println("Length = " + length);

       // *ArithmeticException
            System.out.println("Enter a number to divide 10 by:");
            int num = sc.nextInt();
            int result = 10 / num;
            System.out.println("Result = " + result);

            // *ArrayIndexOutOfBoundsException
            System.out.println("Enter an index (0-4):");
            int index = sc.nextInt();
            int[] arr = new int[5];
            arr[index] = 20;
            System.out.println("arr[" + index + "] = " + arr[index]);
            
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
            System.out.println("Some other exception occurred: " + e.getMessage()); }}
}