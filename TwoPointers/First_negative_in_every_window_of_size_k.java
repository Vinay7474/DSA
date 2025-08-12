package TwoPointers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
public class First_negative_in_every_window_of_size_k {
//     Given an array arr[]       and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

// Note: If a window does not contain a negative integer, then return 0 for that window.

// Examples:

// Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
// Output: [-8, 0, -6, -6]
// Explanation:
// Window [-8, 2] First negative integer is -8.
// Window [2, 3] No negative integers, output is 0.
// Window [3, -6] First negative integer is -6.
// Window [-6, 10] First negative integer is -6.
// Input: arr[] = [12, -1, -7, 8, -15, 30, 16, 28] , k = 3
// Output: [-1, -1, -7, -15, -15, 0] 
// Explanation:
// Window [12, -1, -7] First negative integer is -1.
// Window [-1, -7, 8] First negative integer is -1.
// Window [-7, 8, -15] First negative integer is -7.
// Window [8, -15, 30] First negative integer is -15.
// Window [-15, 30, 16] First negative integer is -15.
// Window [30, 16, 28] No negative integers, output is 0.
// Input: arr[] = [12, 1, 3, 5] , k = 3
// Output: [0, 0] 
// Explanation:
// Window [12, 1, 3] No negative integers, output is 0.
// Window [1, 3, 5] No negative integers, output is 0.

// Constraints:
// 1 <= arr.size() <= 106
// -105 <= arr[i] <= 105
// 1 <= k <= arr.size()
// solution:-------------------------------------------------------------------------------------------

    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int n = arr.length;
        if (n == 1) {
            ans.add(arr[0] < 0 ? arr[0] : 0);
            return ans;
        }
        if (k > n) {
            for (int value : arr) {
                if (value < 0) {
                    ans.add(value);
                    return ans;
                }
            }
            ans.add(0);
            return ans;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                q.add(i);
            }
            
        }

        int start = 0;
        int end = k - 1;
        List<Integer> tempIndexes = new ArrayList<>();

        while (end < n) {
            while (!q.isEmpty() && q.peek() < start) {
                q.poll();
            }
            if (!q.isEmpty() && q.peek() <= end) {
                tempIndexes.add(q.peek()); 
            } else {
                tempIndexes.add(-1); 
            }

            start++;
            end++;
        }
        for (int idx : tempIndexes) {
            ans.add(idx >= 0 ? arr[idx] : 0);
        }

        return ans;
    }
}
