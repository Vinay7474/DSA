// Coin Change (Count Ways)
// gfg
package DP;

import java.util.Arrays;

public class CoinChangeCountWays {
    // Given an integer array coins[ ] representing different denominations of currency and an integer sum, find the number of ways you can make sum by using different combinations from coins[ ]. 
    // Note: Assume that you have an infinite supply of each type of coin. Therefore, you can use any coin as many times as you want.
    // Answers are guaranteed to fit into a 32-bit integer. 

    // Examples:

    // Input: coins[] = [1, 2, 3], sum = 4
    // Output: 4
    // Explanation: Four Possible ways are: [1, 1, 1, 1], [1, 1, 2], [2, 2], [1, 3].
    // Input: coins[] = [2, 5, 3, 6], sum = 10
    // Output: 5
    // Explanation: Five Possible ways are: [2, 2, 2, 2, 2], [2, 2, 3, 3], [2, 2, 6], [2, 3, 5] and [5, 5].
    // Input: coins[] = [5, 10], sum = 3
    // Output: 0
    // Explanation: Since all coin denominations are greater than sum, no combination can make the target sum.
    // Constraints:
    // 1 <= sum <= 103
    // 1 <= coins[i] <= 104
    // 1 <= coins.size() <= 103
     public int count(int coins[], int sum) {
        // code here.
        int [][]dp=new int[coins.length][sum+1];
        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        int count=take(0,sum,dp,coins);
        return count;
    }
    public static int take(int index,int sum,int [][]dp,int []arr){
        if(sum<0||index>=arr.length){
            return 0;
        }
        if(sum==0){
            return 1;
        }
        if(dp[index][sum]!=-1){
            return dp[index][sum];
        }
        
        int left=take(index, sum-arr[index],dp,arr);
        int right=take(index+1,sum,dp,arr);
        dp[index][sum]=left+right;
        return dp[index][sum];
    }
}
