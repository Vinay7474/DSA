// https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=problem-list-v2&envId=prefix-sum
// leetcode 209
package prefixSum;

public class ShortestSubArrayWithSumGreterEqualsToK {
    public int minSubArrayLen(int k, int[] arr) {
        // here i used prefix sum and sliding window to slove this problem 
        // first i find the prefix sum and in that check each index is equals to the given target in that case , i returned 1 as the minn length sum array (which is not a optimised solution)
        // and then i calculated the j where the sum exceed the target for the first time 
        // i pointed as j and i take another pointer i=1(for calculation purpose)
        // and now on i check the sum between intervals and updating the min length of the sub array
        // after i solved this problem i realized that this is not a optimal solution 
        // in the worst case it is going to O(n^2)

        int n=arr.length;
        int[] sum=new int [n];
        sum[0]=arr[0];
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+arr[i];
            if(arr[i]==k){
                return 1;
            }
        }
        int j=0;
        while(j<n&&sum[j]<k){
            j++;
        }
        if(j==n){
            return 0;
        }
        int min=j+1;
        int i=1;
        while(i<j){
            while(sum[j]-sum[i-1]>=k){
                min=Math.min(min,j-i+1);
                i++;
            }
            if(j<n-1){
                j++;
            }
            else{
                i++;
            }
        }
        return min;
    }
    // after i solved this question i compared with others solutions 
    // and i finally got another idea 
    // i dont need to maintain the prefix sum array i just need to use only the two pointers
    // here is the solution
    // public int minSubArrayLen(int target, int[] nums) {
    //     int n = nums.length;
    //     int ans = n+1;
    //     int i = 0;
    //     int j = 0;
    //     int sum = 0;

    //     while(j< n){
    //         sum += nums[j];

    //         while(sum >= target && i <= j){
    //             ans =Math.min(ans,j-i+1);
    //             sum -= nums[i];
    //             i++;
    //         }
    //         j++;
    //     }
    //     return (ans == (n+1))?0:ans;
    // }
}
