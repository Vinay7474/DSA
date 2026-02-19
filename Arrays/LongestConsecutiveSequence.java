package Arrays;

import java.util.HashSet;
// https://leetcode.com/problems/longest-consecutive-sequence/
public class LongestConsecutiveSequence {
//     Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

// You must write an algorithm that runs in O(n) time.

 

// Example 1:

// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
// Example 2:

// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9
// Example 3:

// Input: nums = [1,0,1,2]
// Output: 3
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
 public int longestConsecutive(int[] nums) {
       HashSet<Integer>set=new HashSet<>();
       for(int i:nums) set.add(i);
       int n=nums.length;
        int max=0;
        int count=0;
       for(int i:set){
            if(!set.contains(i-1)){
                count=1;
                int current=i;
                while(set.contains(current+1)){
                    current+=1;
                    count++;
                }
                max=Math.max(max,count);
            }
       }
       return max;
    }
}
