
// *LENGTH HAS TO EQUAL
//  *The frequency of each character must be the same.  here frequency means : number of times a character occurs in a string
//  *NO CHARECTER SHOULD BE DIFFERENT OR EXTRA 
// ✅ Is
// ip = "felt"
// op = "telf"
// an anagram?
// ✔ YES, it is an anagram.
// *❌ No, an anagram does NOT always give a meaningful word.


// import java.util.HashMap;
// import java.util.Scanner;

// public class Anagram {

//    public static void Is_anagram(String s,String t){
// if(s.length()!=t.length()){
//    System.out.println("Not anagram");
//     return;
// }
// HashMap<Character,Integer>map=new HashMap<>();
// for(char ch:s.toCharArray()){
//    map.put(ch,map.getOrDefault(ch,0)+1);

// }
// for (char ch : s2.toCharArray()) {
//             if (!map.containsKey(ch)) {
//                 System.out.println("Not an Anagram");
//                 return;
//             }
//             map.put(ch, map.get(ch) - 1);

//             if (map.get(ch) == 0) {
//                 map.remove(ch);
//             }
//         }

//         System.out.println(map.isEmpty() ? "Valid Anagram" : "Not an Anagram");
//    }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first string: ");
//         String s = sc.nextLine();

//         System.out.print("Enter second string: ");
//         String t = sc.nextLine();
// s=s.replace("\\s", "").toLowerCase();
// t=t.replace("\\s","").toLowerCase();


// }
// }
