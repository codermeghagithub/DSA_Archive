
# Bubble Sort Time Complexity Cases

## Best Case (Already Sorted Ascending Order)
- Only **1 pass** is needed (no swaps, `swapped = false`).
- **Time Complexity:** O(n)

## Worst Case (Descending Order)
- Every element is in the reverse place.
- Bubble Sort has to do maximum swaps in every pass.
- Number of comparisons:
**(n-1) + (n-2) + ... + 1 = n(n-1)/2**


- This simplifies to **O(n²)**

## Average Case (Random Order)
- On average, still around **O(n²)** comparisons and swaps.


| Case        | Time Complexity |
|-------------|-----------------|
| Best Case   | O(n)            |
| Average Case| O(n²)           |
| Worst Case  | O(n²)           |
| Space       | O(1)            |
