package Hashing;

import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s="pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
     public static int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int max=0;
        int count=0;
        for(char ch :s.toCharArray()){
            if(set.contains(ch)){
                max=Math.max(max,count);
                count=0;
                set.clear();
            }
            else{
                set.add(ch);
                count++;
            }
        }
        max=Math.max(max,count);
        return max;

    }
}
