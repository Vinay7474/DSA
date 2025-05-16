import java.util.HashMap;
public class LongestPalindrome {
    // https://leetcode.com/problems/longest-palindrome/description/?envType=problem-list-v2&envId=hash-table
// problem no.409 leetcode



     public int longestPalindrome(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        //here we count the frequencies of all characters that are present in the string 
        for(char ch :s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // the main logic is to take all even pairs and place one character with odd frequency
        //so here i took all even pairs and if the character is odd we take on character from it and add it to the palindrome string and make hasOdd as true
        //i continued this step for the rest of characters and at the end i check the hasOdd value if it true i add the odd character that i removed 
         int count = 0;
        boolean hasOdd = false;

        for (int val : map.values()) {
            if (val % 2 == 0) {
                count += val;
            } else {
                count += val - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) count += 1;

        return count;
    }


// Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

// Letters are case sensitive, for example, "Aa" is not considered a palindrome.

 

// Example 1:

// Input: s = "abccccdd"
// Output: 7
// Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
// Example 2:

// Input: s = "a"
// Output: 1
// Explanation: The longest palindrome that can be built is "a", whose length is 1.



}
