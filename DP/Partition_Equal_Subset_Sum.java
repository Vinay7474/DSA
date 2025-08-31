package DP;
// https://leetcode.com/problems/partition-equal-subset-sum/
// https://www.geeksforgeeks.org/dsa/tug-of-war/
public class Partition_Equal_Subset_Sum {
//     Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or false otherwise.

 

// Example 1:

// Input: nums = [1,5,11,5]
// Output: true
// Explanation: The array can be partitioned as [1, 5, 5] and [11].
// Example 2:

// Input: nums = [1,2,3,5]
// Output: false
// Explanation: The array cannot be partitioned into equal sum subsets.
 

// Constraints:

// 1 <= nums.length <= 200
// 1 <= nums[i] <= 100

// solution:--------------------------------------------------------
static Boolean[][] memo;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        memo=new Boolean[nums.length][target+1];
        return check(0,0,target,nums);
    }
     public static boolean check(int i, int sum, int target, int[] arr){
        if(sum==target){
            return true;
        }
        if(i>=arr.length||sum>target){
            return false;
        }
        
        if(memo[i][sum]!=null){
            return memo[i][sum];
        }
        boolean left = check(i + 1, sum + arr[i], target, arr);
        boolean right = check(i + 1, sum, target, arr);

        memo[i][sum]= left||right;
        return memo[i][sum];
    }
}
