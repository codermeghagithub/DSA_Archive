// **Anagram def=>Two strings are anagrams if they use the same letters in the same quantity, but arranged differently.

// Input: s = "anagram", t = "nagaram"
// Output: true

// Input: s = "rat", t = "car"
// Output: false
import java.util.Scanner;
public class Anagram
{
    
    public static boolean checkAnagram(String s,String t){
        StringBuilder sb=new StringBuilder(t);
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<=s.length()-1;i++){
            boolean found=false;
            for(int j=0;j<=sb.length()-1;j++){
                if(s.charAt(i)==sb.charAt(j)){
                    sb.deleteCharAt(j);
                    found=true;
                    break;
                }
                }
                if(found==false){
                    return false;
                }
            }
            return true;
        }

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter 1st string :");
	    String s=sc.nextLine();
		System.out.println("Enter 2nd String :");
		String t=sc.nextLine();
		
		boolean res=checkAnagram(s,t);
		System.out.println(res);
	}
}
