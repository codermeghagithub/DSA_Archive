// **Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.
// import java.util.Scanner;
// public class Back_Space{

//     public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);

//         StringBuilder sb = new StringBuilder();

//         System.out.print("Enter first word: ");
//         String s1 = sc.nextLine();
//         int hash_count=0;
//         StringBuilder actual_str=new StringBuilder();
//         for(int i=s1.length()-1;i>=0;i--){
//             if(s1.charAt(i)=='#'){
//                 hash_count++;
//                 // continue; // **No continue is needed because after finishing the if (hash_count > 0) block,
// //** the loop automatically moves to the next iteration(end of the loop) [i--]. 
//             }
//             if(hash_count>0){ // hash_count>0
//              hash_count--;
//              continue;
//             }
//             else{
//                 actual_str.insert(0,s1.charAt(i));
//             }
//             }
//             System.out.println(actual_str);
//         }
//     }



// **

import java.util.Scanner;
public class Back_Space {
    
    
    public static String convert_act_str(String str){
        
        int hash_count=0;
        StringBuilder actual_str=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='#'){
                hash_count++;
                continue;
            }
            if(hash_count>0){
                hash_count--;
            }
            else{
                actual_str.insert(0,str.charAt(i));
            }
           
        }
        return actual_str.toString();
        
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        System.out.print("Enter first word: ");
        String s1 = sc.nextLine();
           System.out.print("Enter second word: ");
        String s2 = sc.nextLine();
        
        String s3=convert_act_str(s1);
        String s4=convert_act_str(s2);
        System.out.print(s3.equals(s4));
        
    }
}
        
        