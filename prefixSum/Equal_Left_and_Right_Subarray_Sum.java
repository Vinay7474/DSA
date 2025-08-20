package prefixSum;
// https://www.geeksforgeeks.org/problems/equal-left-and-right-subarray-sum--170647/1
// https://leetcode.com/problems/find-the-middle-index-in-array/description/
public class Equal_Left_and_Right_Subarray_Sum {
//     Given an array arr. The task is to find the first index in the array such that the sum of elements before it is equal to the sum of elements after it. Return -1 if no such point exists.

// Examples :

// Input: arr[] = [1,3,5,2,2] 
// Output: 2 
// Explanation: For second test case at position 2 elements before it (1+3) = elements after it (2+2). 
// Input: arr[] = [1]
// Output: 0
// Explanation: Since its the only element hence it is the only point.
// Input: arr[] = [5, 4, 3, 2, 1]
// Output: -1
// Constraints:
// 1 ≤ arr.size() ≤ 106
// 0 ≤ arr[i] ≤ 106
// solution:----------------------------------------prefix sum----------------------------------------------------------
int equalSum(int[] arr) {
        // Write your code here
        int n=arr.length;
        int [] sum =new int [n];
        for(int i=0;i<n;i++){
            if(i==0){
                sum[i]=arr[i];
            }
            else{
                sum[i]=sum[i-1]+arr[i];
            }
        }
        int last=sum[n-1];
        for(int i=0;i<n;i++){
            if(i==0){
                if(last-sum[i]==0){
                    return 0;
                }
            }
            else if(i>0&&last-sum[i]==sum[i-1]){
                return i;
            }
        }
        return -1;
    }


}
