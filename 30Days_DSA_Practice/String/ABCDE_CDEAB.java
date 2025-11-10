
// **Input: s = "abcde", goal = "cdeab"
// Output: true
import java.util.Scanner;

public class ABCDE_CDEAB {

    static void Reverse(char[] ch1, int l, int r) {
        while (l < r) {
            char temp = ch1[l];
            ch1[l] = ch1[r];
            ch1[r] = temp;
            l++;
            r--;
        }

    }

    static void Rotate(char[] ch1, int k) {
        int n = ch1.length;
        k = k % n;
        Reverse(ch1, 0, k -1);
        Reverse(ch1, k, n - 1);
        Reverse(ch1, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ant string");
        String s = sc.nextLine();
        
        System.out.println("Enter K value:");
        int k = sc.nextInt();
char[] ch1 = s.toCharArray();
        Rotate(ch1, k);
 String res = new String(ch1);
        System.out.println("After rotation the string :" + res);    }
}


// ** leetcode 

// class Solution{
//     private void ReverseStr(char[] ch1,int l,int r){
//         while(l<r){
//             char temp=ch1[l];
//             ch1[l]=ch1[r];
//             ch1[r]=temp;
//             l++;
//             r--;
//         }

//     }
//     public boolean rotateString(String s, String goal) {
//         int n=s.length();
//         if(n!=goal.length()){
//             return false;
//         }
//         for(int k=0;k<=n-1;k++){
//             char[] ch1=s.toCharArray();
//             ReverseStr(ch1,0,k-1);
//             ReverseStr(ch1,k,n-1);
//             ReverseStr(ch1,0,n-1);
//             String res=new String(ch1);
        
//         if(res.equals(goal)){
//             return true;
//         }}
//         return false;

//     }
// }

// **

// ** how to roteated or reverse a string using 2 pointer 
// import java.util.Scanner;
// public class Rotate_str {
//   public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter ant string");
// String s=sc.nextLine();
// char[] ch1=s.toCharArray();
// int left=0;
// int right=ch1.length-1;
// while(left<right){
//     char temp=ch1[left];
//     ch1[left]=ch1[right];
//     ch1[right]=temp;
//     left++;
//     right--;
// }
// String reverse=new String(ch1);
// System.out.println("After rotation the string   :"+reverse);
//   }
// }
// import java.util.Scanner;
// public class Main {
//     static boolean isrotatestr(String s) {
//         char[] ch1=s.toCharArray();
//         int left=0;
//         int right =ch1.length-1;
//         while(left<right){
//     char temp=ch1[left];
//     ch1[left]=ch1[right];
//     ch1[right]=temp;
//     left++;
//     right--;
//       }
//         String revered=new String(ch1);
//         System.out.println("After rotation the string   :"+revered);
//           // Check if reversed == original
//         return s.equals(revered);
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any string:");
//         String s = sc.nextLine();
//         boolean result=isrotatestr(s);
//         System.out.println("After rotation we have to check pallindrom nither i can't retun boolen value  :"+result); // **After rotation we have to check pallindrom nither i can't retun boolen value  :true
//     }
// }
