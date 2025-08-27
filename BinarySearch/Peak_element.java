// https://www.geeksforgeeks.org/problems/peak-element/1
public class Peak_element {
//     You are given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist).

// If there are multiple peak elements, Return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".

// Note: Consider the element before the first element and the element after the last element to be negative infinity.

// Examples :

// Input: arr = [1, 2, 4, 5, 7, 8, 3]
// Output: true
// Explanation: arr[5] = 8 is a peak element because arr[4] < arr[5] > arr[6].
// Input: arr = [10, 20, 15, 2, 23, 90, 80]
// Output: true
// Explanation: Element 20 at index 1 is a peak since 10 < 20 > 15. Index 5 (value 90) is also a peak, but returning any one peak index is valid.
// Constraints:
// 1 ≤ arr.size() ≤ 106
// -231 ≤ arr[i] ≤ 231 - 1
// solutionn:--------------------------------------------
public int peakElement(int[] arr) {
        // code here
        int n=arr.length;
        if(n==1){
            return 0;
        }
        if(n==0){
            return -1;
        }
        int start=0;
        int end=n-1;
        int left=-1;
        int right=-1;
        while(start<=end){
            int mid=(start+end)/2;
           if(mid-1>=0){
             left=Math.max(arr[mid],arr[mid-1]);
               
           }else{
               left=arr[mid];
           }
           if(mid+1<n){
               
           right=Math.max(arr[mid],arr[mid+1]);
           }
           else{
               right=arr[mid];
           }
           if(left==arr[mid]&&right==arr[mid]){
               return mid;
           }
           else if (left>right){
               end=mid-1;
               
           }
           else{
               start=mid+1;
           }
        }
        return -1;
    }
}
