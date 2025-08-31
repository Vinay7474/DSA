package BackTracking;

import java.util.ArrayList;

public class All_Palindromic_Partitions {
    
//     Given a string s, find all possible ways to partition it such that every substring in the partition is a palindrome.

// Examples:

// Input: s = "geeks"
// Output: [[g, e, e, k, s], [g, ee, k, s]]
// Explanation: [g, e, e, k, s] and [g, ee, k, s] are the only partitions of "geeks" where each substring is a palindrome.
// Input: s = "abcba"
// Output: [[a, b, c, b, a], [a, bcb, a], [abcba]]
// Explanation: [a, b, c, b, a], [a, bcb, a] and [abcba] are the only partitions of "abcba" where each substring is a palindrome.
// Constraints:
// 1 ≤ s.size() ≤ 20
// solution:--------------------------------------------------------------------
 public ArrayList<ArrayList<String>> palinParts(String s) {
        // code here
         ArrayList<ArrayList<String>> ans = new ArrayList<>();
         ArrayList<String> path = new ArrayList<>();
         helper(ans ,path, s, 0, s.length());
         return ans;
    }
    public void helper(ArrayList<ArrayList<String>> ans, ArrayList<String> path, String s, int start, int n){
         if (start == n) {
            ans.add(new ArrayList<>(path)); 
            return;
        }
        for (int end = start; end < n; end++) {
            if (isPalindrome(s, start, end)) {
                path.add(s.substring(start, end + 1));
                helper(ans, path, s, end + 1, n);      
                path.remove(path.size() - 1);           
            }
        }
    }
    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
