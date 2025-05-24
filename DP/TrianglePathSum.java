// https://www.geeksforgeeks.org/problems/triangle-path-sum/0
// gfg  Triangle Path Sum,leetocode 120

package DP;

import java.util.ArrayList;
import java.util.Arrays;

public class TrianglePathSum {
    // Given a triangle array, return the minimum path sum to reach from top to bottom.

    // For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.

    // Examples:

    // Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
    // Output: 11
    // Explanation:
    // 2
    // 3 4
    // 6 5 7
    // 4 1 8 3
    // The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11.
    // Input: triangle = [[10]]
    // Output: 10
    // Constraint:
    // 1 <= triangle.size() <= 200
    // triangle[i].size() =  triangle[i-1].length + 1
    // 1 <= triangle[i][j] <= 1000
    public int minPathSum(ArrayList<ArrayList<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return dfs(0, 0, triangle, dp);
    }
     public int dfs(int row, int col, ArrayList<ArrayList<Integer>> triangle, int[][] dp) {
        if (row == triangle.size() - 1) {
            return triangle.get(row).get(col);
        }

        if (dp[row][col] != -1) {
            return dp[row][col];
        }

        int down = dfs(row + 1, col, triangle, dp);
        int downRight = dfs(row + 1, col + 1, triangle, dp);

        dp[row][col] = triangle.get(row).get(col) + Math.min(down, downRight);
        return dp[row][col];
    }
}
