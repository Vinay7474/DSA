package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Shortest_Source_to_Destination_Path {

    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // If the source or destination is 0, we can't even start or finish
        if (A[0][0] == 0 || A[X][Y] == 0) {
            return -1;
        }
        
        // If source is destination
        if (X == 0 && Y == 0) {
            return 0;
        }
        
        // Directions: Up, Down, Left, Right
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        boolean[][] visited = new boolean[N][M];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 0}); // {row, col, distance}
        visited[0][0] = true;
        
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];
            int dist = curr[2];
            
            // If we reached the destination
            if (r == X && c == Y) {
                return dist;
            }
            
            // Explore all 4 neighbors
            for (int[] dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                
                // Check boundaries and if cell is unvisited and traversable (1)
                if (nr >= 0 && nr < N && nc >= 0 && nc < M && A[nr][nc] == 1 && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc, dist + 1});
                }
            }
        }
        
        // If we exhausted all options and didn't reach destination
        return -1;
    }
}
