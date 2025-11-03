// *Given  a string s , return the number of palindromic substring in it .
// i/p=> s="abc"
// output=3

import java.util.Scanner;
public class Day_3 {

    static boolean isPallindrome(String str2) {
        int i = 0;
        boolean flag = true;
        int j = str2.length() - 1;
        while (i < j) {
            if (str2.charAt(i) != str2.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        //  if(flag==true){
        // System.out.println("Pallindrom");
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str2;
        String str1;
        int count = 0;

        System.out.print("Enter any string: ");
        str1 = sc.nextLine();
        StringBuilder gtr = new StringBuilder(str1);
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                str2 = str1.substring(i, j);
                System.out.print(str2);
                if (isPallindrome(str2)) {
                    count++;
                }

            }
        }
        System.out.print("\n Number of total pallindrome substring " + count);

    }
}
