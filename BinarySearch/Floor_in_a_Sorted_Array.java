public class Floor_in_a_Sorted_Array {
    // https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
    public static void main(String[] args) {
        int [] arr={1, 2, 8, 10, 10, 12, 19};
        int x=5;
        System.out.println(findFloor(arr,x));
    }
    public static int findFloor(int[] arr, int x) {
//         Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.

// Note: In case of multiple occurrences of ceil of x, return the index of the last occurrence.

// Examples

// Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
// Output: 1
// Explanation: Largest number less than or equal to 5 is 2, whose index is 1.
// Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 11
// Output: 4
// Explanation: Largest Number less than or equal to 11 is 10, whose indices are 3 and 4. The index of last occurrence is 4.
// Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 0
// Output: -1
// Explanation: No element less than or equal to 0 is found. So, output is -1.
// solution:-------------------------------------------------------------------

        // code here
        if(arr[0]>x){
            return -1;
        }
        int n=arr.length;
        if(arr[n-1]<x){
            return n-1;
        }
        int start=0;
        int end=n-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]<x){
                start=mid+1;
            }
            else if(arr[mid]>x){
                end=mid-1;
            }
            else if(arr[mid]==x){
                start=mid;
            }
        }
        return end;
    }
}
