// https://www.geeksforgeeks.org/problems/search-in-a-rotated-array0959/1
public class Search_An_Element_In_Sorted_And_Rotated_Array {
//     Given a sorted and rotated array A of N distinct elements which are rotated at some point, and given an element K. The task is to find the index of the given element K in array A.

// Example 1:

// Input:
// N = 9
// A[] = {5,6,7,8,9,10,1,2,3}
// K = 10
// Output: 5
// Explanation: 10 is found at index 5.
// Example 1:

// Input:
// N = 3
// A[] = {3,1,2}
// K = 1
// Output: 1
// User Task:
// Complete Search() function and return the index of the element K if found in the array. If the element is not present, then return -1.

// Expected Time Complexity: O(log N).
// Expected Auxiliary Space: O(1).

// Constraints:
// 1 ≤ N ≤ 107
// 0 ≤ Ai ≤ 108
// 1 ≤ K ≤ 108
// solution:------------------------------------------------
 static int Search(int arr[], int x) {
        // code here
        int n=arr.length;
        if(n==0){
            return -1;
        }
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x){
                return mid;
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
        return -1;
    }
}
