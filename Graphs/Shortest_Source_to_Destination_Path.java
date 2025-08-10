package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Shortest_Source_to_Destination_Path {
    public static void main(String[] args) {
        int N=3, M=4;
        int[][]A={{1,1,1,1}, 
                {1,1,1,1},
                {1,1,1,1}};
        int X=0, Y=3 ;
        System.out.println(shortestDistance(N, M, A, X, Y));
    }
    public static int shortestDistance(int N, int M, int mat[][], int X, int Y) {
        // code here
        Queue<int[]> q=new LinkedList<>();
        boolean visited[][]=new boolean[N][M];
        q.add(new int[]{0,0,0});
        int [] brow={-1,1,0,0};
        int [] bcol={0,0,1,-1};
        visited[0][0]=true;
        int min=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int arr[]=q.poll();
            int row=arr[0];
            int col=arr[1];
            int time=arr[2];
            System.out.println(row+","+col+","+time);
            
            for(int i=0;i<4;i++){
                int r=row+brow[i];
                int c=col+bcol[i];
                if(r>=0&&r<N&&c>=0&&c<M){
                    if(r==X&&c==Y){
                    min=Math.min(min,time+1);
                    // continue;
                }
                    if(mat[r][c]==1&&!visited[r][c]){
                        // if(r!=X&&c!=Y){
                            visited[r][c]=true;
                            System.out.println("visited:"+r+" "+c);
                            
                        // }
                        q.add(new int[]{r,c,time+1});
                    }
                }
                
            }
        }
        return min;
    }
}
