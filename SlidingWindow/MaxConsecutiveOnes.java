// https://leetcode.com/problems/max-consecutive-ones-iii/description/
// leetcode 1004 (Max Consecutive Ones III)
package SlidingWindow;

public class MaxConsecutiveOnes {
    // Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

    

    // Example 1:

    // Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    // Output: 6
    // Explanation: [1,1,1,0,0,1,1,1,1,1,1]
    // Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
    // Example 2:

    // Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
    // Output: 10
    // Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
    // Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
    

    // Constraints:

    // 1 <= nums.length <= 105
    // nums[i] is either 0 or 1.
    // 0 <= k <= nums.length


    // here is my logic 
    // I used sliding window technique here 
    // I count the no of zeroes in the window 
    // if the count<k I continue to expand the window size to right 
    // if count>k then I shrink the size of the window till the count not exceeding k from left to right 
    // while maintaining the window I check the maximum size of the window 
    // at the end I return the maximum size of the window
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0;
        int zero=0;
        int n=nums.length;
        int max=0;
        while(right<n){
            if(nums[right]==0){
                zero++;
            }
            while(zero>k){
                if(nums[left]==0){
                    zero--;
                }
                left++;

            }
            max=Math.max(max, right-left+1);
            right++;
        }
        return max;
    }
}
