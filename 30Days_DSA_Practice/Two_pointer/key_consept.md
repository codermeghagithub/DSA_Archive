# Control Flow Between `Reverse_arr` and `Swap`

Take array:

arr = [1, 2, 3, 4, 5]

---

### Step 1: Enter `Reverse_arr(arr)`
- `i = 0`, `j = 4`
- `while (i < j)` → `0 < 4` → **true**  
- Calls: `Swap(arr, 0, 4)`

---

### Step 2: Inside `Swap(arr, 0, 4)`
- Swaps `arr[0]` and `arr[4]`
- Array becomes: `[5, 2, 3, 4, 1]`
- `Swap` finishes → control **returns back** to the line after `Swap` in `Reverse_arr`.

---

### Step 3: Back in `Reverse_arr`
After swap:
```java
i++;   // i = 1
j--;   // j = 3

So indices have moved inward.

Step 4: Loop continues
Check while (i < j) → 1 < 3 → true

Calls: Swap(arr, 1, 3)

Step 5: Inside Swap(arr, 1, 3)
Swaps arr[1] and arr[3]

Array becomes: [5, 4, 3, 2, 1]

Returns back to Reverse_arr.

Step 6: Back in Reverse_arr again
i++ → 2

j-- → 2

Check loop: while (i < j) → 2 < 2 → false

Loop ends ✅
```
### 🔑 Key Concept
Every time you call Swap(), it executes and then returns control to Reverse_arr right after where it was called.

That’s when i++ and j-- happen.

Then the while loop decides if it should call Swap() again.

## Basic for mat to check array is sort or not 

```java 
// check if array is sorted
    static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
```

**EXAMPLE :**

```JAVA

import java.util.Scanner;
public class Main {

static void Printarr(int[] arr){
    int n=arr.length;
    System.out.println("ARRAY:");
    // ** 1 0 0 1 0 1 1 0 0  => 0 0 0 0 0 1 1 1 1 
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }}
static void  Swap(int[] arr,int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
        
  }       
        
     
static void sortZerosandOne(int[] arr){
int n=arr.length;
int l=0,r=n-1;
boolean alreadySorted = true;
for (int i = 0; i < n-1; i++) {
    if (arr[i] > arr[i + 1]) {
        alreadySorted = false;
        break;
    }}

if(alreadySorted){
    System.out.println("array alredy sorted");
return ;
}
    while (l < r) {
    if (arr[l] == 1 && arr[r] == 0) {
        Swap(arr, l, r);
        l++;
        r--;
    } 
        if ( arr[l] == 0) {
            l++;
        }
        if (arr[r] == 1) {
            r--;
        }
    }
}
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size:");

    int n=sc.nextInt();
    int[] arr=new int[n];

    System.out.println("Enter ele in arr:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("BEFORE SORTING ARRAY:");
        Printarr(arr);
        sortZerosandOne(arr);
       System.out.println("after SORTING ARRAY:");
       Printarr(arr);
  }
}

```