package BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Permutations {
//     Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

// Example 1:

// Input: nums = [1,1,2]
// Output:
// [[1,1,2],
//  [1,2,1],
//  [2,1,1]]
// Example 2:

// Input: nums = [1,2,3]
// Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 

// Constraints:

// 1 <= nums.length <= 8
// -10 <= nums[i] <= 10
// solution :---------------------------------------------------------------
 public List<List<Integer>> permuteUnique(int[] nums) {
         HashMap<Integer,Integer>map=new HashMap<>();
        for(int i :nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<List<Integer>>set=new HashSet<>();
        List<Integer> sb=new ArrayList<>();
        check(map,set,sb,nums.length);
        List<List<Integer>>ans= new ArrayList<List<Integer>>(set);
        return ans;
    }
    public static void check(HashMap<Integer,Integer>map,HashSet<List<Integer>>set,List<Integer> sb, int n){
        if(sb.size()==n){
            set.add(new ArrayList<>(sb));
            return;
        }
        
        for(int c :map.keySet()){
            int count=map.get(c);
            if(count>0){
                map.put(c,count-1);
                sb.add(c);
                check(map,set,sb,n);
                sb.remove(sb.size()-1);
                map.put(c,count);
            }
        }
    }
}
