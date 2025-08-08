package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Find_the_number_of_islands {
//     Given a grid of size n*m (n is the number of rows and m is the number of columns in the grid) consisting of 'W's (Water) and 'L's (Land). Find the number of islands.

// Note: An island is either surrounded by water or the boundary of a grid and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.

// Examples:

// Input: grid[][] = [['L', 'L', 'W', 'W', 'W'], ['W', 'L', 'W', 'W', 'L'], ['L', 'W', 'W', 'L', 'L'], ['W', 'W', 'W', 'W', 'W'], ['L', 'W', 'L', 'L', 'W']]
// Output: 4
// Explanation:
// The image below shows all the 4 islands in the grid.
 
// Input: grid[][] = [['W', 'L', 'L', 'L', 'W', 'W', 'W'], ['W', 'W', 'L', 'L', 'W', 'L', 'W']]
// Output: 2
// Expanation:
// The image below shows 2 islands in the grid.
 
// Constraints:
// 1 ≤ n, m ≤ 500
// grid[i][j] = {'L', 'W'}
// solution:---------------------------------------------------------------------------------------------------------------------------
public int countIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'L' && !visited[i][j]) {
                    count++;
                    bfs(visited, grid, i, j);
                }
            }
        }
        return count;
    }

    public static void bfs(boolean[][] visited, char[][] grid, int row, int col) {
        Queue<Integer> qrow = new LinkedList<>();
        Queue<Integer> qcol = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        qrow.add(row);
        qcol.add(col);
        visited[row][col] = true; // mark as visited when enqueued

        while (!qrow.isEmpty()) {
            int rw = qrow.poll();
            int cl = qcol.poll();
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int r = rw + i;
                    int c = cl + j;
                    if ((r >= 0 && r < n) && (c >= 0 && c < m)) {
                        if (grid[r][c] == 'L' && !visited[r][c]) {
                            qrow.add(r);
                            qcol.add(c);
                            visited[r][c] = true; // important: mark as visited here
                        }
                    }
                }
            }
        }
    }
    // note: if only directions horizontal and vertical 
    //  int[] drow = {-1, 1, 0, 0};
        //     int[] dcol = {0, 0, -1, 1};
        // while (!qrow.isEmpty()) {
        //     int rw = qrow.poll();
        //     int cl = qcol.poll();
        //     for (int d = 0; d < 4; d++) {
        //         int r = rw + drow[d];
        //         int c = cl + dcol[d];
        //         if ((r >= 0 && r < n) && (c >= 0 && c < m)) {
        //             if (grid[r][c] == '1' && !visited[r][c]) {
        //                 qrow.add(r);
        //                 qcol.add(c);
        //                 visited[r][c] = true;
        //             }
        //         }
        //     }

                

        // }
}
