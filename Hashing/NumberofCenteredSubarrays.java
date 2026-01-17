package Hashing;

import java.util.HashSet;

public class NumberofCenteredSubarrays {
    // 3804. Number of Centered Subarrays
// Attempted
// Medium
// Topics
// premium lock icon
// Companies
// Hint
// You are given an integer array nums.

// A subarray of nums is called centered if the sum of its elements is equal to at least one element within that same subarray.

// Return the number of centered subarrays of nums.

 

// Example 1:

// Input: nums = [-1,1,0]

// Output: 5

// Explanation:

// All single-element subarrays ([-1], [1], [0]) are centered.
// The subarray [1, 0] has a sum of 1, which is present in the subarray.
// The subarray [-1, 1, 0] has a sum of 0, which is present in the subarray.
// Thus, the answer is 5.
// Example 2:

// Input: nums = [2,-3]

// Output: 2

// Explanation:

// Only single-element subarrays ([2], [-3]) are centered.

 

// Constraints:

// 1 <= nums.length <= 500
// -105 <= nums[i] <= 105


// ORDER OF THE STATEMENTS IS ALSO VERY IMPORTANT.....
 public int centeredSubarrays(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            HashSet<Integer>sum=new HashSet<>();
            int temp=0;
            for (int j=i;j<n;j++){
                temp+=nums[j];
               sum.add(nums[j]);
               if(sum.contains(temp)){
                count++;
               }
            }
        }
        return count;
    }
}
