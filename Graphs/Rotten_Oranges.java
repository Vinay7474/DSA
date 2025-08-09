package Graphs;

import java.util.LinkedList;
import java.util.Queue;
// https://www.geeksforgeeks.org/problems/rotten-oranges2536/1
// https://leetcode.com/problems/rotting-oranges/description/
public class Rotten_Oranges {
//     Given a matrix mat[][] of dimension n * m where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:
// 0 : Empty cell
// 1 : Cell have fresh oranges
// 2 : Cell have rotten oranges

// We have to determine what is the earliest time after which all the oranges are rotten. A rotten orange at index (i, j) can rot other fresh orange at indexes (i-1, j), (i+1, j), (i, j-1), (i, j+1) (up, down, left and right) in a unit time.

// Note: Your task is to return the minimum time to rot all the fresh oranges. If not possible returns -1.

// Examples:

// Input: mat[][] = [[0, 1, 2], [0, 1, 2], [2, 1, 1]]
// Output: 1
// Explanation: Oranges at positions (0,2), (1,2), (2,0) will rot oranges at (0,1), (1,1), (2,2) and (2,1) in unit time.
// Input: mat[][] = [[2, 2, 0, 1]]
// Output: -1
// Explanation: Oranges at (0,0) and (0,1) can't rot orange at (0,3).
// Input: mat[][] = [[2, 2, 2], [0, 2, 0]]
// Output: 0
// Explanation: There is no fresh orange. 
// Constraints:
// 1 ≤ mat.size() ≤ 500
// 1 ≤ mat[0].size() ≤ 500
// mat[i][j] = {0, 1, 2} 
// solution:-------------------------------------------------------------------------------------------
public int orangesRotting(int[][] mat) {
        // Code here
        int n=mat.length;
        int m=mat[0].length;
       
        boolean[][] visited=new boolean[n][m];
        int ones=0;
        int sr=-1;
        int sc=-1;
        Queue<Integer>qrow=new LinkedList<>();
        Queue<Integer>qcol=new LinkedList<>();
        Queue<Integer>qtime=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    ones++;
                }
                if(sr==-1&&sc==-1&&mat[i][j]==2){
                    sr=i;
                    sc=j;
                }
               
            }
        }
        if(ones==0)return 0;
        if(sr==-1&&sc==-1){
            return -1;
        }
        
        int max=0;
        qrow.add(sr);
        qcol.add(sc);
        qtime.add(0);
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==2){
                    qrow.add(i);
                    qcol.add(j);
                    qtime.add(0);
                }
               
            }
        }
        
        visited[sr][sc]=true;
        int[] drow={-1,1,0,0};
        int[] dcol={0,0,1,-1};
        while(!qrow.isEmpty()&&!qcol.isEmpty()&&!qtime.isEmpty()){
            int row=qrow.poll();
            int col=qcol.poll();
            int time=qtime.poll();
            max=Math.max(max,time);
            for(int i=0;i<4;i++){
                int r=row+drow[i];
                int c=col+dcol[i];
                if((r>=0&&r<n)&&(c>=0&&c<m)){
                    if(mat[r][c]==1&&!visited[r][c]){
                        visited[r][c]=true;
                        ones--;
                        qrow.add(r);
                        qcol.add(c);
                        mat[r][c]=2;
                        qtime.add(time+1);
                    }
                }
            }
        }
        if(ones!=0){
            return -1;
        }
        return max;
        
        
    }
    // optimized version (clean version)
    // class Solution {
    // public int orangesRotting(int[][] mat) {
    //     int n = mat.length;
    //     int m = mat[0].length;
    //     boolean[][] visited = new boolean[n][m];

    //     int ones = 0;
    //     Queue<int[]> q = new LinkedList<>(); // Each element is {row, col, time}

    //     // Collect all rotten oranges and count fresh oranges
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             if (mat[i][j] == 2) {
    //                 q.add(new int[]{i, j, 0});
    //                 visited[i][j] = true;
    //             }
    //             if (mat[i][j] == 1) ones++;
    //         }
    //     }

    //     if (ones == 0) return 0; // No fresh orange
    //     if (q.isEmpty()) return -1; // No rotten orange to start

    //     int maxTime = 0;
    //     int[] drow = {-1, 1, 0, 0};
    //     int[] dcol = {0, 0, 1, -1};

    //     while (!q.isEmpty()) {
    //         int[] cur = q.poll();
    //         int row = cur[0], col = cur[1], time = cur[2];
    //         maxTime = Math.max(maxTime, time);

    //         for (int i = 0; i < 4; i++) {
    //             int r = row + drow[i];
    //             int c = col + dcol[i];

    //             if (r >= 0 && r < n && c >= 0 && c < m) {
    //                 if (mat[r][c] == 1 && !visited[r][c]) {
    //                     visited[r][c] = true;
    //                     mat[r][c] = 2;  // It becomes rotten
    //                     ones--;
    //                     q.add(new int[]{r, c, time + 1});
    //                 }
    //             }
    //         }
    //     }

    //     // If there are still fresh oranges left, return -1
    //     return ones == 0 ? maxTime : -1;
    // }
// }

}
