package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
// https://www.geeksforgeeks.org/problems/word-break-part-23249/1
// https://leetcode.com/problems/word-break-ii/description/
public class WordBreak_2 {
//     Given a string s and a dictionary dict[] of valid words, you need to return all possible ways to break the string s into sentence such that each word in the sentence is a valid dictionary word.
// You are allowed to use a valid word multiple times in the sentence.

// Examples:

// Input: s = "likegfg", dict[] = ["lik", "like", "egfg", "gfg"]
// Output: 
// "lik egfg"
// "like gfg"
// Explanation: All the words in the given sentences are present in the dictionary.
// Input: s = "geeksforgeeks", dict[] = ["for", "geeks"]
// Output: "geeks for geeks"
// Explanation: The string "geeksforgeeks" can be broken into valid words from the dictionary in one way.
// Constraints:
// 1 ≤ dict.size() ≤ 20
// 1 ≤ dict[i] ≤ 15
// 1 ≤ s.size() ≤ 500
// solution:---------------------------------------------------------------------
static StringBuilder sb=new StringBuilder();
    static ArrayList<String>ans=new ArrayList<>();
    static HashSet<String> dic;
    static String s;
    static String[] wordBreak(String[] dict, String temp) {
        // code here
        s=temp;
        int n=s.length();
        dic = new HashSet<>(Arrays.asList(dict));
        ans.clear();         
        sb.setLength(0);
        check(0,n);
        return ans.toArray(new String[ans.size()]);
    }
    public static void check(int i,int n){
        if(i>=n){
            ans.add(sb.toString().trim());
            return;
        }
        StringBuilder temp=new StringBuilder(); 
        for(int k=i;k<n;k++){
            temp.append(s.charAt(k));
            if(dic.contains(temp.toString())){
                sb.append(temp.toString()+" ");
                check(k+1,n);
                int start=sb.lastIndexOf(temp.toString()+" ");
                sb.delete(start,sb.length());
                
            }
            
        }
    }

}
