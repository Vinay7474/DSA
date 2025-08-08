package Graphs;
// https://www.geeksforgeeks.org/problems/number-of-provinces/1
// https://leetcode.com/problems/number-of-provinces/description/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Provinces {
//     Number of Provinces
// Difficulty: MediumAccuracy: 54.29%Submissions: 157K+Points: 4Average Time: 20m
// Given an undirected graph with V vertices. We say two vertices u and v belong to a single province if there is a path from u to v or v to u. Your task is to find the number of provinces.

// Note: A province is a group of directly or indirectly connected cities and no other cities outside of the group.

// Example 1:

// Input:[[1, 0, 1],[0, 1, 0],[1, 0, 1]]
 
// Output:
// 2
// Explanation:
// The graph clearly has 2 Provinces [1,3] and [2]. As city 1 and city 3 has a path between them they belong to a single province. City 2 has no path to city 1 or city 3 hence it belongs to another province.
// Example 2:
// Input:[[1, 1],[1, 1]]

  

// Output :
// 1

// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function numProvinces() which takes an integer V and an adjacency matrix adj(as a 2d vector) as input and returns the number of provinces. adj[i][j] = 1, if nodes i and j are connected and adj[i][j] = 0, if not connected.


// Expected Time Complexity: O(V2)
// Expected Auxiliary Space: O(V)


// Constraints:
// 1 ≤ V ≤ 500
// solution:-----------------------------------------------------------------------------------------------------------------------------
static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        HashSet<Integer>visited=new HashSet<>();
        int count=0;
        for(int i=0;i<V;i++){
            if(!visited.contains(i)){
                count++;
                bfs(i,visited,adj,V);
            }
        }
        return count;
    }
    public static void bfs(int i, HashSet<Integer> visited, ArrayList<ArrayList<Integer>> adj, int V) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited.add(i);
        while (!q.isEmpty()) {
            int current = q.poll();
            for (int j = 0; j < V; j++) {
                // Check for a direct connection in the adjacency matrix
                if (adj.get(current).get(j) == 1 && !visited.contains(j)) {
                    q.add(j);
                    visited.add(j);
                }
            }
        }
    }


}
