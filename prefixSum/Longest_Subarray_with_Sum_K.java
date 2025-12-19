package prefixSum;

import java.util.HashMap;

public class Longest_Subarray_with_Sum_K {
//     Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. If there is no subarray with sum equal to k, return 0.

// Examples:

// Input: arr[] = [10, 5, 2, 7, 1, -10], k = 15
// Output: 6
// Explanation: Subarrays with sum = 15 are [5, 2, 7, 1], [10, 5] and [10, 5, 2, 7, 1, -10]. The length of the longest subarray with a sum of 15 is 6.
// Input: arr[] = [-5, 8, -14, 2, 4, 12], k = -5
// Output: 5
// Explanation: Only subarray with sum = -5 is [-5, 8, -14, 2, 4] of length 5.
// Input: arr[] = [10, -10, 20, 30], k = 5
// Output: 0
// Explanation: No subarray with sum = 5 is present in arr[].
// Constraints:
// 1 ≤ arr.size() ≤ 105
// -104 ≤ arr[i] ≤ 104
// -109 ≤ k ≤ 109
// solution:-----------------------------------------------------
 public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                max=i+1;
            }
            if(map.containsKey(sum-k)){
                max=Math.max(max,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max;
        
        
    }
    // When you encounter a problem involving "Subarray Sums," 
    // you should visualize the array as a series of accumulating totals.
    // 1. The Goal EquationThink of the problem as:
    // CurrentSum - PreviousSum = k
    // To find a subarray that equals k,
    //  you simply rearrange that math:
    // PreviousSum = CurrentSum - k
    // This tells you exactly what to search for in your HashMap.
}
