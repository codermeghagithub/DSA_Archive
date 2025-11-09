// *string SHOULD BE COMPRESSESD SUCH THAT CONSECUTIVE DUPLICATES OF CHARECTERS ARE REPLACED WITH THE CHARECTER AND FOLLOWED BY THE NUMBER OF CONSECUTIVE DUPLICATES 

// * i/p=>aaabbbbccddde
// *o/p=>a3b4c2d3e

import java.util.Scanner;

public class Day_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.nextLine();
        StringBuffer sb=new StringBuffer();
        int count =1;
        
        String ans=""+str.charAt(0);
        for(int i=1;i<str.length();i++){
        char prev=str.charAt(i-1);
        char curr=str.charAt(i); // * current
        if(curr==prev){
          count++;
          ans+=curr+count;
        }
        }

    }
}
