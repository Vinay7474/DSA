package TwoPointers;

import java.util.Stack;
// https://www.geeksforgeeks.org/problems/valid-substring0624/1
// https://leetcode.com/problems/longest-valid-parentheses/description/
public class ValidSubstring {
//     Given a string s consisting only of opening and closing parentheses ( and ), find the length of the longest valid (well-formed) parentheses substring.

// Note: The length of the smallest valid substring () is 2.

// Examples:

// Input: s = "(()("
// Output: 2
// Explanation: The longest valid substring is (). Its length is 2. 
// Input: s = "()(())("
// Output: 6
// Explanation: The longest valid substring is ()(()). Its length is 6.
// Input: s = "(()())"
// Output: 6
// Explanation: The longest valid substring is (()()). Its length is 6.
// Constraints:
// 1 <= s.size() <= 105
// s[i] = { '(' , ')' }
// solution :-------------------------------------------------------------------
static int maxLen(String s) {
        Stack<Integer> stack = new Stack<>();
        int start = 0, end = 0;
        int max = 0;
        int n = s.length();

        while (end < n) {
            while (stack.isEmpty() && start < n && s.charAt(start) == ')') {
                start++;
                end = Math.max(end, start); 
            }

            if (start >= n) {
                return max;
            }

            if (s.charAt(end) == '(') {
                stack.push(end);
            } 
            else if (!stack.isEmpty()) {
                stack.pop();
                if (stack.isEmpty()) {
                    max = Math.max(max, end - start + 1);
                } else {
                    max = Math.max(max, end - stack.peek());
                }
            } 
            else {
                start = end + 1;
            }

            end++;
        }

        return max;
    }
}
