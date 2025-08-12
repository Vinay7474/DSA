package TwoPointers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class First_negative_in_every_window_of_size_k {
    public static void main(String[] args) {
         int []arr={ 2, 3,10,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1} ; int k = 20;
         System.out.println(firstNegInt(arr,k));
    }
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> ans=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                q.add(i);
                System.out.println(i);
            }
        }
        System.out.println(q);
        int start=0;
        int end =k-1;
        int last=-1;
        while(end<n){
            System.out.println(q.peek());
            System.out.println(start+"-"+end);
            
            if(!q.isEmpty()&&start<=q.peek()&&q.peek()<=end){
                last=q.poll();
                ans.add(last);
            }
            else if(q.isEmpty()&&start<=last&&end>=last){
                ans.add(last);
            }
            else{
                ans.add(-1);
            }
            System.out.println(ans);
            start++;
            end++;
        }
        return ans;
        
    }
}
