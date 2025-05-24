// https://www.geeksforgeeks.org/problems/cutted-segments1642/1
// gfg Maximize The Cut Segments

package DP;

import java.util.Arrays;

public class MaximizeTheCutCount {
    // Given an integer n denoting the Length of a line segment. You need to cut the line segment in such a way that the cut length of a line segment each time is either x , y or z. Here x, y, and z are integers.
    // After performing all the cut operations, your total number of cut segments must be maximum. Return the maximum number of cut segments possible.

    // Note: if no segment can be cut then return 0.

    // Examples:

    // Input: n = 4, x = 2, y = 1, z = 1
    // Output: 4
    // Explanation: Total length is 4, and the cut lengths are 2, 1 and 1.  We can make maximum 4 segments each of length 1.
    // Input: n = 5, x = 5, y = 3, z = 2
    // Output: 2
    // Explanation: Here total length is 5, and the cut lengths are 5, 3 and 2. We can make two segments of lengths 3 and 2.
    // Input: n = 7, x = 8, y = 9, z = 10
    // Output: 0
    // Explanation: Here the total length is 7, and the cut lengths are 8, 9, and 10. We cannot cut the segment into lengths that fully utilize the segment, so the output is 0.
    // Constraints
    // 1 <= n, x, y, z <= 104
    public int maximizeCuts(int n, int x, int y, int z) {
        int[] arr = {x,y,z};
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = max(n,arr, dp);
        return ans < 0 ? 0 : ans;
    }

    public static int max(int n,int []arr,int[] dp) {
        if(n==0){
            return 0;
        }
        if(n<0){
            return Integer.MIN_VALUE;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int m=Integer.MIN_VALUE;
        int bigX=max(n-arr[0],arr,dp)+1;
        m=Math.max(m,bigX);
        int bigY=max(n-arr[1],arr,dp)+1;
        m=Math.max(m,bigY);
        int bigZ=max(n-arr[2],arr,dp)+1;
        m=Math.max(m,bigZ);
        dp[n]=m;
        return dp[n];
        
        
    }
}
