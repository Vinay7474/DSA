package TwoPointers;
// https://leetcode.com/problems/reverse-string/
public class Reverse_String {
    /*
         Write a function that reverses a string. The input string is given as an array of characters s.

        You must do this by modifying the input array in-place with O(1) extra memory.



        Example 1:

        Input: s = ["h","e","l","l","o"]
        Output: ["o","l","l","e","h"]
        Example 2:

        Input: s = ["H","a","n","n","a","h"]
        Output: ["h","a","n","n","a","H"]


        Constraints:

        1 <= s.length <= 105
        s[i] is a printable ascii character.
    */
//    solution:----------------------------------------------------------
  public void reverseString(char[] arr) {
        int n=arr.length;
        int start=0;
        int end =n-1;
        while(start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
}
