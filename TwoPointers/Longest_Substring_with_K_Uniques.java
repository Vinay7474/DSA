package TwoPointers;
// https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1
import java.util.HashMap;

public class Longest_Substring_with_K_Uniques {
//     You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters.

// Note : If no such substring exists, return -1. 

// Examples:

// Input: s = "aabacbebebe", k = 3
// Output: 7
// Explanation: The longest substring with exactly 3 distinct characters is "cbebebe", which includes 'c', 'b', and 'e'.
// Input: s = "aaaa", k = 2
// Output: -1

// Explanation: There's no substring with 2 distinct characters.
// Input: s = "aabaaab", k = 2
// Output: 7
// Explanation: The entire string "aabaaab" has exactly 2 unique characters 'a' and 'b', making it the longest valid substring.
// Constraints:
// 1 ≤ s.size() ≤ 105
// 1 ≤ k ≤ 26
// solution:------------------------------------------------------------------------------------------------
 public int longestKSubstr(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int left = 0, right = 0;
        int max = -1;

        while (right < n) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while (map.size() > k) {
                char c = s.charAt(left);
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
                left++;
            }
            if (map.size() == k) {
                max = Math.max(max, right - left + 1);
            }
            right++;
        }
        return max;
    }
}
