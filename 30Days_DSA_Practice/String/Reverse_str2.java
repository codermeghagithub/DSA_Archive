// *Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

// *If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
// Example 1:
// Input: s = "abcdefg", k = 2
// Output: "bacdfeg"
// Example 2:
// Input: s = "abcd", k = 2
// Output: "bacd"


import java.util.Scanner;
public class Reverse_str2 {
    public static void main(String[] arga) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String s = sc.nextLine();
        System.out.print("Enter k value: ");
        int k = sc.nextInt();
        char[] ch = s.toCharArray();
        for (int i = 0; i < k; i++) {
            char temp = ch[i];
            ch[i] = ch[k];
            ch[k] = temp;
            i++;
            k--;
        }
        String rstr_two = new String(ch);

        System.out.println(rstr_two);

    }
}
