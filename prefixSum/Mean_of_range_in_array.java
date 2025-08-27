package prefixSum;
// https://www.geeksforgeeks.org/problems/mean-of-range-in-array2123/1
import java.util.ArrayList;

public class Mean_of_range_in_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int q[] = {0, 2, 1, 3, 0, 4}; 
        System.out.println(findMean(arr, q));
    }
       public static ArrayList<Integer> findMean(int arr[], int q[]) {

        // Complete the function
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        int [] sum=new int [n];
        sum[0]=arr[0];
        for(int i=1;i<n;i++){
            sum[i]=sum[i-1]+arr[i];
        }
        int i=1;
        int m=q.length;
        while(i<m){
            int start=q[i-1];
            int end=q[i];
            int count=end-start+1;
            int s=0;
            if(start==0){
                s=sum[end];
            }
            else{
                s=sum[end]-sum[start-1];
            }
            ans.add(s/count);
            i+=2;
        }
        return ans;
    }
}
