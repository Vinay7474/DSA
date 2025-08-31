package BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
// https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
public class Permutations_of_a_String {
//     Given a string s, which may contain duplicate characters, your task is to generate and return an array of all unique permutations of the string. You can return your answer in any order.

// Examples:

// Input: s = "ABC"
// Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]
// Explanation: Given string ABC has 6 unique permutations.
// Input: s = "ABSG"
// Output: ["ABGS", "ABSG", "AGBS", "AGSB", "ASBG", "ASGB", "BAGS", "BASG", "BGAS", "BGSA", "BSAG", "BSGA", "GABS", "GASB", "GBAS", "GBSA", "GSAB", "GSBA", "SABG", "SAGB", "SBAG", "SBGA", "SGAB", "SGBA"]
// Explanation: Given string ABSG has 24 unique permutations.
// Input: s = "AAA"
// Output: ["AAA"]
// Explanation: No other unique permutations can be formed as all the characters are same.
// Constraints:
// 1 <= s.size() <= 9
// s contains only Uppercase english alphabets
// solution:----------------------------------------------------------------
public ArrayList<String> findPermutation(String s) {
        // Code here
        HashMap<Character,Integer>map=new HashMap<>();
        for(char i :s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<String>set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        check(map,set,sb,s.length());
        ArrayList<String>ans= new ArrayList<>(set);
        return ans;
    }
    public static void check(HashMap<Character,Integer>map,HashSet<String>set,StringBuilder sb, int n){
        if(sb.length()==n){
            set.add(sb.toString());
            return;
        }
        
        for(char c :map.keySet()){
            int count=map.get(c);
            if(count>0){
                map.put(c,count-1);
                sb.append(c);
                check(map,set,sb,n);
                sb.deleteCharAt(sb.length()-1);
                map.put(c,count);
            }
        }
    }
}
