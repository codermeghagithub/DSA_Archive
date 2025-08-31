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
//  int[] numbers = {1, 2, 3};
// System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
//         } catch (ArrayIndexOutOfBoundsException e) {
//             // Handle the specific exception
//System.out.println("Array index is out of bounds!");
//             System.out.println("Error message: " + e.getMessage());
//         }
        
//         System.out.println("Program continues executing...");
//     }
// }

// ** 2. Multiple Catch Blocks
// import java.util.Scanner;
// public class Basic{
//   public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   try {
//     // * NullPointerException
//   System.out.println("Enter a string (or press Enter to test  NullPointerException):");
//     String input = sc.nextLine();
//     String str=input.isEmpty() ?null:input; //  *make it null if user enters nothing
//     int length=str.length();  // *will throw NPE if str is null
//     System.out.println("Length = " + length);

//        // *ArithmeticException
//             System.out.println("Enter a number to divide 10 by:");
//             int num = sc.nextInt();
//             int result = 10 / num;
//             System.out.println("Result = " + result);

//             // *ArrayIndexOutOfBoundsException
//             System.out.println("Enter an index (0-4):");
//             int index = sc.nextInt();
//             int[] arr = new int[5];
//             arr[index] = 20;
//             System.out.println("arr[" + index + "] = " + arr[index]);
            
//           } catch (NullPointerException e) {
//             System.out.println("Null pointer exception occurred: " +e.getMessage());
//     }
//     catch (ArithmeticException e){
//       System.out.println("Arithmetic exception occurred: " + e.getMessage());
//     }
//   catch (ArrayIndexOutOfBoundsException e) {
//      System.out.println("Array index out of bounds: " + e.getMessage());
//   } 
//   catch (Exception e) {
   // * Generic catch block - should be last
//             System.out.println("Some other exception occurred: " + e.getMessage()); }}
// }



// ** 3. try-catch-finally Block

// import java.util.*;
// public class Basic  
// {      
//     public static void main(String args[])  
//     {  
//       Scanner sc=new Scanner(System.in);   
//       try {
//         int y;      
//         System.out.println("enter y value ");  
//         y =sc.nextInt();
//         //The below code throws a divide by zero exception    
//        int data=25/y;      
//        System.out.println(data);      
//       }     
//       //handles the Arithmetic Exception / Divide by zero exception    
//       catch(ArithmeticException e){    
//         System.out.println("Exception handled");    
//         System.out.println(e);    
//       }     
//       //executes regardless of exception occurred or not     
//       finally {    
//         System.out.println("Finally block is always executed");    
//       }      
//       System.out.println("rest of the code...");      
//     }      
// }    


// SIMPLE try-catch-finally WITHOUT file handling
public class Basic {
    public static void main(String[] args) {
        
        // **Example 1: Basic try-catch-finally
        System.out.println("=== Example 1: Basic Structure ===");
        try {
            System.out.println("1. Inside try block");
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("2. This never executes");
        } catch (ArithmeticException e) {
            System.out.println("3. Caught exception: " + e.getMessage());
        } finally {
            System.out.println("4. Finally block always executes");
        }
        System.out.println("5. Program continues");
        
        
        // **Example 2: Finally executes even without exception
        System.out.println("\n=== Example 2: No Exception ===");
        try {
            System.out.println("1. Inside try block");
            int result = 10 / 2; // No exception
            System.out.println("2. Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("3. This won't execute");
        } finally {
            System.out.println("4. Finally still executes");
        }
        System.out.println("5. Program continues");
        
        
        // **Example 3: Resource simulation (without actual files)
        System.out.println("\n=== Example 3: Resource Simulation ===");
        String resource = null;
        
        try {
            System.out.println("1. Trying to get resource");
            // Simulate getting a resource
            boolean resourceAvailable = false; // Change to true to test success
            
            if (resourceAvailable) {
                resource = "MyResource";
                System.out.println("2. Resource obtained: " + resource);
            } else {
                throw new RuntimeException("Resource not available");
            }
            
        } catch (RuntimeException e) {
            System.out.println("3. Failed to get resource: " + e.getMessage());
        } finally {
            System.out.println("4. Cleanup time!");
            
            // Cleanup resource if it was obtained
            if (resource != null) {
                System.out.println("5. Cleaning up resource: " + resource);
                resource = null; // "Release" the resource
            } else {
                System.out.println("5. No resource to clean up");
            }
        }
        System.out.println("6. Program finished");
    }
}

/*
OUTPUT for this code:
=== Example 1: Basic Structure ===
1. Inside try block
3. Caught exception: / by zero
4. Finally block always executes
5. Program continues

=== Example 2: No Exception ===
1. Inside try block
2. Result: 5
4. Finally still executes
5. Program continues

=== Example 3: Resource Simulation ===
1. Trying to get resource
3. Failed to get resource: Resource not available
4. Cleanup time!
5. No resource to clean up
6. Program finished
*/


// **Another try-catch-finally Block
// import java.io.*;

// public class Basic {
//     public static void main(String[] args) {
//         FileInputStream file = null;
        
//         try {
//             file = new FileInputStream("nonexistent.txt");
//             // Code to read from file
//             System.out.println("File opened successfully");
            
//         } catch (FileNotFoundException e) {
//             System.out.println("File not found: " + e.getMessage());
            
//         } catch (IOException e) {
//             System.out.println("IO Exception occurred: " + e.getMessage());
            
//         } finally {
//             // This block always executes
//             System.out.println("Finally block executed");
            
//             // Clean up resources
//             if (file != null) {
//                 try {
//                     file.close();
//                     System.out.println("File closed successfully");
//                 } catch (IOException e) {
//                     System.out.println("Error closing file: " + e.getMessage());
//                 }
//             }
//         }
        
//         System.out.println("Program execution completed");
//     }
// }