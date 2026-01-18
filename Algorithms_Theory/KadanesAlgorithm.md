# Kadane’s Algorithm

## 📌 Problem Statement
Given an integer array `arr` (which may contain both positive and negative numbers), find the **maximum sum of a contiguous subarray**.

---

## 🧠 What is Kadane’s Algorithm?
Kadane’s Algorithm is a **dynamic programming technique** used to solve the **Maximum Subarray Sum** problem efficiently.

Instead of checking all possible subarrays (which would take O(n²) or O(n³) time), Kadane’s Algorithm solves the problem in **linear time O(n)**.

---

## 🔑 Core Idea
At every index, we decide:
- Whether to **extend the previous subarray**, or
- **Start a new subarray** from the current element.

If the running sum becomes negative, it is discarded because it cannot help in forming a maximum sum subarray.

---

## 🧮 Algorithm Logic
For each element `arr[i]`:
current_sum = max(arr[i], current_sum + arr[i])
max_sum = max(max_sum, current_sum)

---

## 🧪 Example

### Input
arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

### Output


### Explanation
The subarray `[4, -1, 2, 1]` gives the maximum sum:

4 + (-1) + 2 + 1 = 6

---

## 📊 Step-by-Step Execution

| Index | Element | Current Sum | Maximum Sum |
|------|--------|-------------|-------------|
| 0 | -2 | -2 | -2 |
| 1 | 1 | 1 | 1 |
| 2 | -3 | -2 | 1 |
| 3 | 4 | 4 | 4 |
| 4 | -1 | 3 | 4 |
| 5 | 2 | 5 | 5 |
| 6 | 1 | 6 | 6 |
| 7 | -5 | 1 | 6 |
| 8 | 4 | 5 | 6 |

---

## 🧾 Pseudocode
max_sum = arr[0]
current_sum = arr[0]

for i = 1 to n-1:
current_sum = max(arr[i], current_sum + arr[i])
max_sum = max(max_sum, current_sum)

return max_sum

---

## 💻 Implementation

### Java Implementation
```java
public class KadaneAlgorithm {
    public static int maxSubArray(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }
}

### Time and Space Complexity

Time Complexity: O(n)

Space Complexity: O(1)