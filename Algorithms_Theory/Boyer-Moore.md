 the **Boyer-Moore Majority Vote Algorithm**. It's a clever and efficient way to solve Majority Element problem in $O(n)$ time and $O(1)$ space.

The core intuition is to treat the problem as a "vote-canceling" process.

### The Algorithm's Intuition

1.  **The Guarantee:** The most important rule is that a majority element **always exists**. This means it appears *more* than all other elements combined.
2.  **Pairing and Canceling:** Imagine you pick a "candidate" element. You then iterate through the array.
      * If you see the same element, you give it one "vote" (increment a counter).
      * If you see a *different* element, you take away one "vote" (decrement the counter).
3.  **Switching Candidates:** If the counter ever hits zero, it means the current candidate has been "canceled out" by an equal number of other elements. You then discard your current candidate and pick the *next* element you see as the new candidate, starting its count at 1.
4.  **The Winner:** Because the true majority element has more occurrences than *all other elements combined*, it's impossible for it to be fully canceled out by the end. It will always be the last element standing with a count greater than zero.

-----

### Step-by-Step Implementation

You only need two variables:

  * `candidate`: The element we currently *think* is the majority.
  * `count`: The "vote count" for that candidate.

Here is the algorithm in Java:

```java
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0; // The value of candidate doesn't matter initially

        for (int num : nums) {
            // If count is 0, we've "canceled out" the previous candidate.
            // Time to pick a new one.
            if (count == 0) {
                candidate = num;
            }

            // Add to the count if it matches the candidate,
            // otherwise subtract.
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
            
            // A more compact way to write the lines above:
            // count += (num == candidate) ? 1 : -1;
        }

        // Because the problem guarantees a majority element exists,
        // the final 'candidate' *must* be the answer.
        // If it wasn't guaranteed, you'd need a second pass
        // to verify this candidate's count.
        return candidate;
    }
}
```

-----

### Example Walkthrough

Let's trace your example: `nums = [2, 2, 1, 1, 1, 2, 2]`

1.  **Start:** `count = 0`, `candidate = 0`
2.  **`num = 2`**: `count` is 0. Set `candidate = 2`. Set `count = 1`.
      * *State: `candidate = 2`, `count = 1`*
3.  **`num = 2`**: `num == candidate`. Increment `count`.
      * *State: `candidate = 2`, `count = 2`*
4.  **`num = 1`**: `num != candidate`. Decrement `count`.
      * *State: `candidate = 2`, `count = 1`*
5.  **`num = 1`**: `num != candidate`. Decrement `count`.
      * *State: `candidate = 2`, `count = 0`*
6.  **`num = 1`**: `count` is 0. Set `candidate = 1`. Set `count = 1`.
      * *State: `candidate = 1`, `count = 1`*
7.  **`num = 2`**: `num != candidate`. Decrement `count`.
      * *State: `candidate = 1`, `count = 0`*
8.  **`num = 2`**: `count` is 0. Set `candidate = 2`. Set `count = 1`.
      * *State: `candidate = 2`, `count = 1`*

**End of array.** The final candidate is **2**.