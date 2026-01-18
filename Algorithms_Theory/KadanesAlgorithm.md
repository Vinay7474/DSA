# Kadane’s Algorithm

## 📌 Problem Statement
Given an array of integers (which may include negative numbers), find the **maximum sum of a contiguous subarray**.

---

## 🧠 Key Idea
Kadane’s Algorithm is a **dynamic programming** approach that efficiently finds the maximum subarray sum in **O(n)** time.

Instead of checking all possible subarrays (which is costly), we:
- Decide at each index whether to **extend the previous subarray** or
- **Start a new subarray** from the current element.

---

## 🔑 Core Insight
At every index `i`, we compute:

