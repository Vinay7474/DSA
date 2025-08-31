package BackTracking;

import java.util.ArrayList;
// https://www.geeksforgeeks.org/problems/find-all-possible-paths-from-top-to-bottom/1
public class Find_all_possible_paths_from_top_to_bottom {
//     Given a N x M grid. Find All possible paths from top left to bottom right.From each cell you can either move only to right or down.

// Example 1:

// Input: 1 2 3
//        4 5 6
// Output: 1 4 5 6
//         1 2 5 6 
//         1 2 3 6
// Explanation: We can see that there are 3 
// paths from the cell (0,0) to (1,2).
// Example 2:

// Input: 1 2
//        3 4
// Output: 1 2 4
//         1 3 4
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function findAllPossiblePaths() which takes two integers n,m and grid[][]  as input parameters and returns all possible paths from the top left cell to bottom right cell in a 2d array.

// Expected Time Complexity: O(2^N*M)
// Expected Auxiliary Space: O(N)


// Constraints:
// 1 <= n,m <= 10 
// 1 <= grid[i][j] <= n*m
// n * m < 20

// solution:-------------------------------------------
public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n, int m,
                                                                     int[][]arr) {
        // code here
        ArrayList<ArrayList<Integer>> ans =new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> path=new ArrayList<>();
        path.add(arr[0][0]);
        check(ans,path, 0,0,n,m,arr);
        return ans;
    }
    public static void check(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> path,int i,int j,int n, int m,int [][]arr){
        
        if(i>=n||j>=m){
            return;
        }
            if(i==n-1&&j==m-1){
            ans.add(new ArrayList<>(path));
            return;
        }
        if(i<n-1){
            path.add(arr[i+1][j]);
            check(ans, path, i+1,j,n,m,arr);
            path.remove(path.size()-1);
        }
        if(j<m-1){
            path.add(arr[i][j+1]);
            check(ans, path, i,j+1,n,m,arr);
            path.remove(path.size()-1);
        }
    }
}
