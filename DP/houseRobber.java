// https://leetcode.com/problems/house-robber/description/
//  leetcode 198. House Robber
package DP;

import java.util.Arrays;

public class houseRobber {
    // You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

    // Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

    

    // Example 1:

    // Input: nums = [1,2,3,1]
    // Output: 4
    // Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
    // Total amount you can rob = 1 + 3 = 4.
    // Example 2:

    // Input: nums = [2,7,9,3,1]
    // Output: 12
    // Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
    // Total amount you can rob = 2 + 9 + 1 = 12.
    

    // Constraints:

    // 1 <= nums.length <= 100
    // 0 <= nums[i] <= 400
    public int rob(int[] arr) {
         int n=arr.length;
        int []dp=new int [n];
        Arrays.fill(dp,-1);
        int ans=max(0,arr,0,dp);
        return ans;
    }
    public static int max(int sum,int[]arr,int i,int[]dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int left=max(sum,arr,i+2,dp)+arr[i];
        int right=max(sum,arr,i+1,dp);
        dp[i]=Math.max(left,right);
        return dp[i];
        
    }
}
