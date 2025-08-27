// https://www.geeksforgeeks.org/problems/koko-eating-bananas/1
// https://leetcode.com/problems/koko-eating-bananas/description/
public class Koko_Eating_Bananas {
//     Koko is given an array arr[], where each element represents a pile of bananas. She has exactly k hours to eat all the bananas.

// Each hour, Koko can choose one pile and eat up to s bananas from it.

// If the pile has atleast s bananas, she eats exactly s bananas.

// If the pile has fewer than s bananas, she eats the entire pile in that hour.

// Koko can only eat from one pile per hour.


// Your task is to find the minimum value of s (bananas per hour) such that Koko can finish all the piles within k hours.

// Examples:

// Input: arr[] = [5, 10, 3], k = 4
// Output: 5
// Explanation: If Koko eats at the rate of 5 bananas per hour:
// First pile of 5 bananas will be finished in 1 hour.
// Second pile of 10 bananas will be finished in 2 hours.
// Third pile of 3 bananas will be finished in 1 hours.
// Therefore, Koko can finish all piles of bananas in 1 + 2 + 1 = 4 hours.
// Input: arr[] = [5, 10, 15, 20], k = 7
// Output: 10
// Explanation: If Koko eats at the rate of 10 bananas per hour, it will take 6 hours to finish all the piles.
// Constraint:
// 1 ≤ arr.size() ≤ k ≤ 106
// 1 ≤ arr[i] ≤ 106
// solution:----------------------------------------
 public int kokoEat(int[] arr, int k) {
        // code here
        int start=1;
        int end =0;
        for (  int i:arr){
            end=Math.max(i,end);
        }
        int res=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(check(arr,mid,k)){
                res=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
        }
    }
        return res==0?1:res;
    }
    public static boolean check(int[] arr , int s, int k){
        int h=0;
        for( int i:arr){
            h=h+((i+s-1)/s);
            if(h>k){
                return false;
            }
        }
        return true;
    }
}
