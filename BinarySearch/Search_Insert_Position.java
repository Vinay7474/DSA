public class Search_Insert_Position {
//     Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4
 

// Constraints:

// 1 <= nums.length <= 104
// -104 <= nums[i] <= 104
// nums contains distinct values sorted in ascending order.
// -104 <= target <= 104
// solution:-----------------------------------
 public int searchInsert(int[]arr, int x) {
         if(arr[0]>x){
            return 0;
        }
        int n=arr.length;
        if(arr[n-1]<x){
            return n;
        }
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<x){
                start=mid+1;
            }
            else if(arr[mid]>x){
                end=mid-1;
            }
            else if(arr[mid]==x){
                return mid;
            }
        }
        return start;
    }
}
