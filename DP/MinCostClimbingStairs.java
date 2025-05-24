// https://www.geeksforgeeks.org/problems/min-cost-climbing-stairs/1
// gfg Min Cost Climbing Stairs

package DP;

import java.util.Arrays;

public class MinCostClimbingStairs {
    // Given an array of integers cost[] where cost[i] is the cost of the ith step on a staircase. Once the cost is paid, you can either climb one or two steps. Return the minimum cost to reach the top of the floor.
    // Assume 0-based Indexing. You can either start from the step with index 0, or the step with index 1.

    // Examples:

    // Input: cost[] = [10, 15, 20]
    // Output: 15
    // Explanation: Cheapest option is to start at cost[1], pay that cost, and go to the top.



    // Input: cost[] = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
    // Output: 6
    // Explanation: Cheapest option is to start on cost[0], and only step on 1s, skipping cost[3].


    // Constraints:
    // 2 ≤ cost.size() ≤ 105
    // 0 ≤ cost[i] ≤ 999
     static int minCostClimbingStairs(int[] cost) {
        // Write your code here
        int n=cost.length;
        int []dp=new int [n+1];
        Arrays.fill(dp,0);
        dp[0]=cost[0];
        int ans=min(cost,n,dp);
        return ans;
        
    }
    public static int min(int []cost, int n,int dp[]){
        if(n==0||n==1){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int right=Integer.MAX_VALUE;
        int left=min(cost, n-1,dp)+cost[n-1];
        if(n>1){
            
         right=min(cost,n-2,dp)+cost[n-2];
        }
        dp[n]=Math.min(left,right);
        return dp[n];
        
        
    }
}
