

// ** This is Optimize way ✅ Time = O(n)
// ✅ Space = O(n) (a new string of double length is created For example:
// "abcde" + "abcde" → "abcdeabcde")

// class Solution {
//     public boolean rotateString(String s, String goal) {
//        if(s.length()!=goal.length()){
//        return  false;
//        } 
//        return(s+s).contains(goal);
//     }
// }


// ** 2nd way => Space Complexity:O(n) Time complexity:O(n²) 
// So it's not Optimize way but for logic building it's recomendable. Good for learning .
public class Rotate_str{
    private void ReverseStr(char[] ch1,int l,int r){
        while(l<r){
            char temp=ch1[l];
            ch1[l]=ch1[r];
            ch1[r]=temp;
            l++;
            r--;
        }

    }
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        if(n!=goal.length()){
            return false;
        }
        for(int k=0;k<=n-1;k++){
            char[] ch1=s.toCharArray();
            ReverseStr(ch1,0,k-1);
            ReverseStr(ch1,k,n-1);
            ReverseStr(ch1,0,n-1);
            String res=new String(ch1);
        
        if(res.equals(goal)){
            return true;
        }}
        return false;

    }
}