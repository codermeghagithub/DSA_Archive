// **Option 1: Simple Approach (No Exception Handling)

import java.util.Arrays;
import java.util.Scanner;
public class Check_sort_rotated {
    public static boolean issort_rotated(int[] nums) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            // If order breaks more than once, array is not sorted/rotated.
            if (nums[i] > nums[(i + 1) % len]) {
                count++;
            }
        }
        return count <= 1;

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the size of arr:");
        n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter ele in arr:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        if (issort_rotated(nums)) {
            System.out.println("array is  sorted ");
        } else {
            System.out.println("Array is not sorted");
        }

        if (issort_rotated(nums)) {
            System.out.println("Array is already sorted/rotated.");
        } else {
            System.out.println("Array is not sorted, sorting now...");
            Arrays.sort(nums);

            // ** this logic also give me sorted array  but it  is not optimized way 
          // for(int i=0;i<nums.length;i++){
          //   System.out.println("Sorted Array: " +nums[i]);

        System.out.println("Sorted Array: " + Arrays.toString(nums));

        }
      }

        
    }




