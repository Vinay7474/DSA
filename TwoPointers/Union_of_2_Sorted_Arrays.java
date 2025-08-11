package TwoPointers;

import java.util.ArrayList;
// https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1
public class Union_of_2_Sorted_Arrays {
//     Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.
// Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.

// Examples:

// Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
// Output: [1, 2, 3, 4, 5, 6, 7]
// Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
// Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
// Output: [1, 2, 3, 4, 5]
// Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
// Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
// Output: [1, 2]
// Explanation: Distinct elements including both the arrays are: 1 2.
// Constraints:
// 1  ≤  a.size(), b.size()  ≤  105
// -109 ≤ a[i], b[i] ≤109
 public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=a.length;
        int m=b.length;
        if(n<=0||m<=0){
            return ans;
        }
        int index=-1;
        int left=0,right=0;
        int min=Math.min(a[left],b[right]);
        ans.add(min);
        index++;
        while(left<n||right<m){
            while(left<n&&ans.get(index)==a[left]){
                left++;
            }
            while(right<m&&ans.get(index)==b[right]){
                right++;
            }
            int lval=Integer.MAX_VALUE;
            int rval=Integer.MAX_VALUE;
            if(left<n){
                lval=a[left];
            }
            if(right<m){
                rval=b[right];
            }
            if(left<n||right<m){
            min=Math.min(lval,rval);
            ans.add(min);
            index++;
                
            }
        }
        return ans;
    }


}
