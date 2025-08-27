// http://geeksforgeeks.org/problems/search-in-rotated-array-2/1
public class Search_in_Rotated_Array_2 {
//     Given a sorted and rotated array arr[] and a target key. Check whether the key is present in the array or not.

// Note: The array may contains duplicate elements.

// Examples:

// Input: arr[] = [3, 3, 3, 1, 2, 3], key = 3
// Output: true
// Explanation: 3 is present in the array.
// Input: arr[] = [4, 5, 8, 1, 1, 1, 2], key = 6
// Output: false
// Explanation: 6 is not present in the array.
// Constraints:
// 1 ≤ arr.size() ≤ 106
// 0 ≤ arr[i], key ≤ 108
// solution:-------------------------------------------
 public boolean search(int[] arr, int x) {
        // code here
          // code here
        int n=arr.length;
        if(n==0){
            return false;
        }
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                return true;
            }
            // extra lines compared to the distinct rotated sorted array question
            if(arr[start]==arr[mid]&&arr[mid]==arr[end]){
                start++;
                end--;
                continue;
            }
            else if(arr[start]<=arr[mid]){
                if(x>=arr[start]&&x<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(x>arr[mid]&&x<=arr[end]){
                    
                    start=mid+1;
                }
                else{
                    end=mid-1;
                    
                }
                
            }
        }
        return false;
    }
}
