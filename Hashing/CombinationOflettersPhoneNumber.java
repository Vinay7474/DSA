package Hashing;
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/?envType=problem-list-v2&envId=hash-table
// problem no:17 leetcode
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CombinationOflettersPhoneNumber {
    // Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

    // A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
    // Example 1:

    // Input: digits = "23"
    // Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    // Example 2:

    // Input: digits = ""
    // Output: []
    // Example 3:

    // Input: digits = "2"
    // Output: ["a","b","c"]
    // here i used backtracking and hashtable to solve this problem
     public List<String> letterCombinations(String s) {
        // created a hashtable that comtains numbers and respected characters
        HashMap<Integer, ArrayList<Character>> map = new HashMap<>();
        map.put(2, new ArrayList<>(Arrays.asList('a', 'b', 'c')));
        map.put(3, new ArrayList<>(Arrays.asList('d', 'e', 'f')));
        map.put(4, new ArrayList<>(Arrays.asList('g', 'h', 'i')));
        map.put(5, new ArrayList<>(Arrays.asList('j', 'k', 'l')));
        map.put(6, new ArrayList<>(Arrays.asList('m', 'n', 'o')));
        map.put(7, new ArrayList<>(Arrays.asList('p', 'q', 'r', 's')));
        map.put(8, new ArrayList<>(Arrays.asList('t', 'u', 'v')));
        map.put(9, new ArrayList<>(Arrays.asList('w', 'x', 'y', 'z')));
        
        List<String> ans = new ArrayList<>();
        // checing for edgecases
        if (s.length() > 4 || s.length() == 0) {
            return ans;
        }
        
        StringBuilder temp = new StringBuilder();
        get(map, ans, s, 0, temp);
        return ans;
    }

    public static void get(HashMap<Integer, ArrayList<Character>> map, List<String> ans, String s, int key, StringBuilder temp) {
        // checking the length of the string to add the string into the solution list
        if (key == s.length()) {
            ans.add(temp.toString());
            return;
        }
        // converting character to integer to avoid confusion
        int digit = s.charAt(key) - '0';
        // checking weather the map contains the key or not 
        if (!map.containsKey(digit)) {
            return;
        }
        // creating new arraylist to avoid confusion
        ArrayList<Character> chars = map.get(digit);
        for (int i = 0; i < chars.size(); i++) {
            // adding current char to the stringbuilder
            temp.append(chars.get(i));
            get(map, ans, s, key + 1, temp);
            // removing the added character for backtracking
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}
