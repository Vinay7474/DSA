package Arrays;
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/
public class Check_if_Array_Is_Sorted_and_Rotated {
//     Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

// There may be duplicates in the original array.

// Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

 

// Example 1:

// Input: nums = [3,4,5,1,2]
// Output: true
// Explanation: [1,2,3,4,5] is the original sorted array.
// You can rotate the array by x = 2 positions to begin on the element of value 3: [3,4,5,1,2].
// Example 2:

// Input: nums = [2,1,3,4]
// Output: false
// Explanation: There is no sorted array once rotated that can make nums.
// Example 3:

// Input: nums = [1,2,3]
// Output: true
// Explanation: [1,2,3] is the original sorted array.
// You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
 

// Constraints:

// 1 <= nums.length <= 100
// 1 <= nums[i] <= 100
//  solution:----------------------
 public boolean check(int[] nums) {
      int n = nums.length;
        if (n <= 1) {
            return true;
        }
        
        int s = 0;
        int e = n - 1;
        
        while (s < e) {
            int mid = s + (e - s) / 2; 
            
            if (nums[mid] > nums[e]) {
                s = mid + 1;
            } else if (nums[mid] < nums[e]) {
                e = mid;
            } else {
                e--;
            }
        }
        
        int dipIndex = s;

        if (dipIndex == 0) {
            return true;
        } 
        
        else {
            reverse(nums, 0, dipIndex - 1);
            reverse(nums, dipIndex, n - 1);
            reverse(nums, 0, n - 1);

            for (int i = 1; i < n; i++) {
                if (nums[i - 1] > nums[i]) {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int t = arr[start];
            arr[start] = arr[end];
            arr[end] = t;
            start++;
            end--;
        }
    }

}
