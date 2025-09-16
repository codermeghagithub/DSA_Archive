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

🔑 Key Concept
Every time you call Swap(), it executes and then returns control to Reverse_arr right after where it was called.

That’s when i++ and j-- happen.

Then the while loop decides if it should call Swap() again.