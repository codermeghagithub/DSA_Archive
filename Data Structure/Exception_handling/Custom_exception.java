// import java.util.Scanner;
// class MeghaException extends Exception{
//   public MeghaException(String message){
//       super(message);
//   }
// }

// public class Custom_exception {
//       public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int age;
//         System.out.println("enter age:");
//         age=sc.nextInt();
//       try{
//         if(age<18){
//           throw new MeghaException("You must be 18 or older.");
//         }
//         else {
//                 System.out.println("You are eligible.");
//             }

//       }catch(MeghaException e){
//                     System.out.println("Caught exception: " + e.getMessage());

//       }

//       }
// }

 class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Custom_exception {
    public static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or older to register.");
        }
        System.out.println("Registration successful.");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

