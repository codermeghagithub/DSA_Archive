	
// ** Remove duplicates from Sorted array
//**  1. array has to  sorted

import java.util.Scanner;

public class Remove_dup {
  public static boolean issort(int[] nums){
    for(int i=0;i<nums.length-1;i++){
      if(nums[i]>=nums[i+1]){
        return false;
      }
    }
    return true;
  }


  public static void main(String[] args){
int n;
System.out.println("Enter size of array:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] nums=new int [n];
System.out.println("enter ele:");
for(int  i=0;i<n;i++)
{
  nums[i]=sc.nextInt();
}

 System.out.println("Length: " + nums.length);
        // ** Check before sorting
        if (issort(nums)) {
            System.out.println("Array is already sorted.");
        } else {
           System.out.println("Array is not sorted.");
        }

          int k=nums.length;
      int count=0;
    
        for(int j=1;j<k;j++){
            if(nums[j]!=nums[count])
            {
                count++;
                nums[count]=nums[j];
            }
            }
            System.out.println("Number of unique elements: " + (count + 1));
        }
  }
  

