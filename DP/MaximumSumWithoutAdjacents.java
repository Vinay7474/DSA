// https://www.geeksforgeeks.org/problems/max-sum-without-adjacents2430/0
// gfg Max Sum without Adjacents

package DP;

import java.util.Arrays;

public class MaximumSumWithoutAdjacents {
    // Given an array arr containing positive integers. Find the maximum sum of any possible subsequence such that no two numbers in the subsequence should be adjacent in array arr.

    // Examples:

    // Input: arr[] = [5, 5, 10, 100, 10, 5]
    // Output: 110
    // Explanation: If you take indices 0, 3 and 5, then = 5+100+5 = 110.
    // Input: arr[] = [3, 2, 7, 10]
    // Output: 13
    // Explanation: 3 and 10 forms a non continuous subsequence with maximum sum.
    // Input: arr[] = [9, 1, 6, 10]
    // Output: 19
    // Explanation: 9 and 10 forms a non continuous subsequence with maximum sum.
    // Constraints:
    // 1 ≤ arr.size() ≤ 105
    // 1 ≤ arri ≤ 105
    int findMaxSum(int arr[]) {
        // code here
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
