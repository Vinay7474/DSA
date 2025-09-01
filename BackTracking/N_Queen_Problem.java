package BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
// https://www.geeksforgeeks.org/problems/n-queen-problem0315/1
// https://leetcode.com/problems/n-queens/
public class N_Queen_Problem {
// The n-queens puzzle is the problem of placing n queens on a (n × n) chessboard such that no two queens can attack each other. Note that two queens attack each other if they are placed on the same row, the same column, or the same diagonal.

// Given an integer n, find all distinct solutions to the n-queens puzzle.
// You can return your answer in any order but each solution should represent a distinct board configuration of the queen placements, where the solutions are represented as permutations of [1, 2, 3, ..., n]. In this representation, the number in the ith position denotes the row in which the queen is placed in the ith column.
// For eg. below figure represents a chessboard [3 1 4 2].



// Examples:

// Input: n = 1
// Output: [1]
// Explaination: Only one queen can be placed in the single cell available.
// Input: n = 4
// Output: [[2 4 1 3 ] [3 1 4 2 ]]
// Explaination: There are 2 possible solutions for n = 4.
// Input: n = 2
// Output: []
// Explaination: There are no possible solutions for n = 2.
// Constraints:
// 1 ≤ n ≤ 10    
// solution :-----------------------------------------------------------
static int n;
        static HashSet<Integer> colset=new HashSet<>();
    public ArrayList<ArrayList<Integer>> nQueen(int size) {
        // code here
        n=size;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>> ();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(n+1, 0));
        // Arrays.fill(row,0);
        check(ans, list, row,1);
        return ans;
    }
    public static void check(ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> list,ArrayList<Integer> row,int r){
        if(list.size()==n){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=1;i<=n;i++){
            if(colset.contains(i)){
                continue;
            }
            boolean flag=false;
            for(int j=1;j<r;j++){
                int dc=Math.abs(i-row.get(j));
                int dr=Math.abs(r-j);
                if(dc==dr){
                    flag=true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            else{
                // row[r]=i;
                colset.add(i);
                row.set(r,i);
                list.add(i);
                check(ans, list,row,r+1);
                list.remove(list.size()-1);
                // row[r]=0;
                colset.remove(i);
                row.set(r,0);
            }
        }
    }
}
