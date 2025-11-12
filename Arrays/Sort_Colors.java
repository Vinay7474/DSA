package Arrays;
// https://leetcode.com/problems/sort-colors/
public class Sort_Colors {
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
 

// Constraints:

// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.    
// SOLUTION:---------------------------------------------------------------------------
public void sortColors(int[] nums) {
        int low=0;
        int n=nums.length;
        int high=n-1;
        int i=0;
        while(i<=high){
            if(nums[i]==0){
                int t=nums[low];
                nums[low]=nums[i];
                nums[i]=t;
                low++;
                i++;
            }
            else if(nums[i]==2){
                int t=nums[high];
                nums[high]=nums[i];
                nums[i]=t;
                high--;
            }
            else{
                i++;
            }
        }
    }
}
