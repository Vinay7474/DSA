package BackTracking;

import java.util.ArrayList;
import java.util.Collections;

// https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
public class Rat_in_a_Maze {
//     Consider a rat placed at position (0, 0) in an n x n square matrix mat[][]. The rat's goal is to reach the destination at position (n-1, n-1). The rat can move in four possible directions: 'U'(up), 'D'(down), 'L' (left), 'R' (right).

// The matrix contains only two possible values:

// 0: A blocked cell through which the rat cannot travel.
// 1: A free cell that the rat can pass through.
// Your task is to find all possible paths the rat can take to reach the destination, starting from (0, 0) and ending at (n-1, n-1), under the condition that the rat cannot revisit any cell along the same path. Furthermore, the rat can only move to adjacent cells that are within the bounds of the matrix and not blocked.
// If no path exists, return an empty list.

// Note: Return the final result vector in lexicographically smallest order.

// Examples:

// Input: mat[][] = [[1, 0, 0, 0], [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1]]
// Output: ["DDRDRR", "DRDDRR"]
// Explanation: The rat can reach the destination at (3, 3) from (0, 0) by two paths - DRDDRR and DDRDRR, when printed in sorted order we get DDRDRR DRDDRR.
// Input: mat[][] = [[1, 0], [1, 0]]
// Output: []
// Explanation: No path exists as the destination cell is blocked.
// Input: mat = [[1, 1, 1], [1, 0, 1], [1, 1, 1]]
// Output: ["DDRR", "RRDD"]
// Explanation: The rat has two possible paths to reach the destination: 1. "DDRR" 2. "RRDD", These are returned in lexicographically sorted order.
// Constraints:
// 2 ≤ mat.size() ≤ 5
// 0 ≤ mat[i][j] ≤ 1
// solution :------------------------------------------------
 public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n=maze.length;
        int m=maze[0].length;
        ArrayList<String>ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        maze[0][0] = 0;
        call(ans,maze,sb,0,0,n,m);
        Collections.sort(ans);
        return ans;
    }
    public static void call(ArrayList<String>ans,int[][] maze,StringBuilder sb, int i, int j,int n,int m){
        if(i==n-1&&j==m-1){
            ans.add(sb.toString());
            return;
        }
        if(i-1>=0&&maze[i-1][j]!=0){
            sb.append("U");
            maze[i-1][j]=0;
            call(ans,maze,sb,i-1,j,n,m);
            sb.deleteCharAt(sb.length() - 1);
            maze[i-1][j]=1;
        }
        if(i+1<n&&maze[i+1][j]!=0){
            sb.append("D");
            maze[i+1][j]=0;
            call(ans,maze,sb,i+1,j,n,m);
            sb.deleteCharAt(sb.length() - 1);
            maze[i+1][j]=1;
        }
        if(j-1>=0&&maze[i][j-1]!=0){
            sb.append("L");
            maze[i][j-1]=0;
            call(ans,maze,sb,i,j-1,n,m);
            sb.deleteCharAt(sb.length() - 1);
            maze[i][j-1]=1;
        }
        if(j+1<m&&maze[i][j+1]!=0){
            sb.append("R");
            maze[i][j+1]=0;
            call(ans,maze,sb,i,j+1,n,m);
           sb.deleteCharAt(sb.length() - 1);
            maze[i][j+1]=1;
        }
        
        
    }
}
