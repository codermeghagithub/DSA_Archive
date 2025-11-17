// *Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

// *If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
// Example 1:
// Input: s = "abcdefg", k = 2
// Output: "bacdfeg"
// Example 2:
// Input: s = "abcd", k = 2
// Output: "bacd"

// Math.min(k, ch.length)
// Step-by-step:

// k = 2

// ch.length = 4

// Math.min(2, 4) → compares 2 and 4, returns 2 (because 2 is smaller)

// Subtract 1 → 2 - 1 = 1

// ✅ So right = 1

// This means we will reverse from index 0 to 1.

// import java.util.Scanner;
// public class Reverse_str2 {
//     public static void main(String[] arga) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any string: ");
//         String s = sc.nextLine();
//         System.out.print("Enter k value: ");
//         int k = sc.nextInt();
//         char[] ch = s.toCharArray();
//         for (int i = 0; i < k; i++) {
//             char temp = ch[i];
//             ch[i] = ch[k];
//             ch[k] = temp;
//             i++;
//             k--;
//         }
//         String rstr_two = new String(ch);

//         System.out.println(rstr_two);

//     }
// }



// *Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

// *If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
// Example 1:
// Input: s = "abcdefg", k = 2
// Output: "bacdfeg"
// Example 2:
// Input: s = "abcd", k = 2
// Output: "bacd"

// Math.min(k, ch.length)
// Step-by-step:

// k = 2

// ch.length = 4

// Math.min(2, 4) → compares 2 and 4, returns 2 (because 2 is smaller)

// Subtract 1 → 2 - 1 = 1

// ✅ So right = 1

// This means we will reverse from index 0 to 1.

import java.util.Scanner;
public class Reverse_str2 {
    private static void  Reverstr_k(char[] ch,int l,int r)
    {
        while(l<r){        
    char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }

    }
   public static void main(String[] args) {
       
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        System.out.println("Enter the value of k:");
        int k=sc.nextInt();
        char[] ch = s.toCharArray(); 
        int n=s.length();
        int l=0;
        while(l<n){
        int r=Math.min(l+k,n)-1;
        Reverstr_k(ch,l,r);
        l+=k*2;
        }
        String string2=new String(ch);
        System.out.println("Reverse String 2:"+string2);
        }}

        



        

        