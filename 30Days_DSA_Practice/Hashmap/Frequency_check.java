
// ** given an ar find the most frequesnt ele in it . If there are multiple ele that appear a maximum num  of time ,print any one of them.

// **arr[]={1,2,3,1,4,1}

import java.util.HashMap;
import java.util.Scanner;

public class Frequency_check {
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of arr:");
    int n=sc.nextInt();
    System.out.println("Enter ele in arr: ");
    int[] arr=new int[n];
    for(int j=0;j<n;j++){
    arr[j]=sc.nextInt();
    }
   int count=0;
   int which_key=0;
   HashMap <Integer,Integer> num_key=new HashMap<>();
   for(int i:arr){
    if(!num_key.containsKey(i)){
num_key.put(i,1);
    }
    else{
      num_key.put(i,num_key.get(i)+1);
    }
   }
   System.out.println("Frequency map:"+num_key.entrySet());
   
   for(var k:num_key.entrySet()){
       if(count<k.getValue()){
           count=k.getValue();
           which_key=k.getKey();
       }
       else{
           continue;// ** no need to write this
       }
      
   }
   System.out.println("Most occurd value is :"+which_key);
   
  }
}
