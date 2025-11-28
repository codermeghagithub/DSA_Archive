//  *❌ O(2ⁿ) slow using recursion
// import java.util.Scanner;

// public class Fibonacci {

//     static int Is_fibonacci(int n) {
//       int res_fibo=0;
    
//     if(n<=1){
//       return  n;
//     }
// else{
//  return Is_fibonacci(n-1)+Is_fibonacci(n-2);
// }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = sc.nextInt();
//         int final_fibo=Is_fibonacci(n); // * n=6 so 0 1 1 2 3 5 8 and is:  8
// System.out.println("Fibonacci Number is: "+final_fibo);

//     }

// }


// * ⭐ Optimized Fibonacci Using Loop (No Recursion)
// *✔ Uses only loop
// **✔ Time Complexity: O(n)
// **✔ Space Complexity: O(1)
// **✔ Very fast for large n
import java.util.Scanner;

public class Fibonacci {

    static int Is_fibonacci(int n) {
      int res_fibo=0;
    int prev=0,curr=1,next_no=0;
    if(n<=1){
      return  n;
    }
else{
  for(int i=2;i<=n;i++){
next_no=prev+curr;
prev=curr;
curr=next_no;
  }
  return next_no;
 
}
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int final_fibo=Is_fibonacci(n); // * n=6 so 0 1 1 2 3 5 8 and is:  8
System.out.println("Fibonacci Number is: "+final_fibo);

    }

}