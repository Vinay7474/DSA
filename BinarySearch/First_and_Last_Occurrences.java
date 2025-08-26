import java.util.*;
// https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class First_and_Last_Occurrences {
//     Given a sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array.
// Note: If the number x is not found in the array then return both the indices as -1.

// Examples:

// Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
// Output: [2, 5]
// Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5
// Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
// Output: [6, 6]
// Explanation: First and last occurrence of 7 is at index 6
// Input: arr[] = [1, 2, 3], x = 4
// Output: [-1, -1]
// Explanation: No occurrence of 4 in the array, so, output is [-1, -1]
// Constraints:
// 1 ≤ arr.size() ≤ 106
// 1 ≤ arr[i], x ≤ 109
// solution:---------------------------------------------------------------

    public static void main(String[] args) {
        int []arr={1, 3, 5, 5, 5, 5, 67, 123, 125};

        System.out.println(find(arr,5));
    }
     public static ArrayList<Integer> find(int arr[], int x) {
        // code here
        int start=0;
        int n =arr.length;
        int end=n-1;
        ArrayList<Integer>ans=new ArrayList<>();
        if(arr[0]>x||x>arr[end]){
            ans.add(-1);
            ans.add(-1);
            System.out.println(ans);
            return ans;
        }
        int mid=-1;
        while(start<=end){
             mid=(start+end)/2;
            if(arr[mid]<x){
                start=mid+1;
            }
            else if (arr[mid]>x){
                end=mid-1;
            }
            else if(arr[mid]==x){
                break;
            }
        }
        if(start>end){
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        ans.add(left(arr,x,0,mid));
        ans.add(right(arr,x,mid,n-1));
        return ans;
        
    }
    public static int left(int arr[], int x, int start, int end){
         while(start<=end){
             int mid=(start+end)/2;
            if(arr[mid]<x){
                start=mid+1;
            }
            else if (arr[mid]>x){
                end=mid-1;
            }
            else if(arr[mid]==x){
                end=mid-1;
            }
        }
            return start;
    }
     public static int right(int arr[], int x, int start, int end){
         while(start<=end){
             int mid=(start+end)/2;
            if(arr[mid]<x){
                start=mid+1;
            }
            else if (arr[mid]>x){
                end=mid-1;
            }
            else if(arr[mid]==x){
                start=mid+1;
            }
        }
            return end;
    }
}
