import java.util.Scanner;
public class Second_lar {
public static void main(String[] args){
int n; 
    Scanner sc=new Scanner(System.in);
    System.out.println("Enetr the size of arr:");
    n=sc.nextInt();
    int[] arr=new int[n];
    System.out.println("Enter ele in arr:");
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  for(int i=0;i<n;i++){
    boolean swapped=false;
    for(int j=0;j<n-1-i;j++){
      if(arr[j]>arr[j+1]){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
        swapped=true;
      }
    }
    if(!swapped){
      break;
    }
  }
  int largest=arr[n-1];
int sec_largest=-1;
  System.out.println("The second largest element is:");
  for(int i=n-2;i>=0;i--){
    if(largest>arr[i]){
      sec_largest=arr[i];
      break;
      
    }
}
if(sec_largest==-1)
System.out.println("All elements are equal. No second largest.");
else{


  System.out.println("Second largest ele:"+sec_largest);
}

}}
