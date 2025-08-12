package TwoPointers;

import java.util.HashMap;

public class Longest_Substring_with_At_Most_K_Distinct_Characters {
//     Problem statement
// You are given a string 'str' and an integer ‘K’. Your task is to find the length of the largest substring with at most ‘K’ distinct characters.

// For example:
// You are given ‘str’ = ‘abbbbbbc’ and ‘K’ = 2, then the substrings that can be formed are [‘abbbbbb’, ‘bbbbbbc’]. Hence the answer is 7.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= T <= 10
// 1 <= K <= 26
// 1 <= |str| <= 10^6

// The string str will contain only lowercase alphabets.    

// Time Limit: 1 sec
// Note:
// You do not need to print anything. It has already been taken care of. Just implement the function.
// Sample Input 1:
// 2
// 2
// abbbbbbc
// 3
// abcddefg
// Sample Output 1:
// 7
// 4
// Explanation:
// For the first test case, ‘str’ = ‘abbbbbbc’ and ‘K’ = 2, then the substrings that can be formed are [‘abbbbbb’, ‘bbbbbbc’]. Hence the answer is 7.

// For the second test case, ‘str’ = ‘abcddefg’ and ‘K’ = 3, then the substrings that can be formed is [‘cdde’, ‘ddef’]. Hence the answer is 4.
// Sample Input 2:
// 2
// 3
// aaaaaaaa
// 1
// abcefg
// Sample Output 2:
// 8   
// 1   
public static int kDistinctChars(int k, String s) {
		// Write your code here
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
            if (map.size() <= k) {
                max = Math.max(max, right - left + 1);
            }
            right++;
        }
        return max;
	}


}
