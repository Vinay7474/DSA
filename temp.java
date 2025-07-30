public class temp {
    public static void main(String[] args) {
        System.out.println(countWays("15392132"));
    }
   public static int  countWays(String s) {
        // code here
        int count=0;
        int n=s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='0'){
                return 0;
            }
            if(i<=n-2){
                String a=s.substring(i-1,i+1);
                System.out.println(a);
                int num=Integer.valueOf(a);
                System.out.println(num);
                if(num<=26){
                    count+=2;
                }
            }
            else{
                String a=s.substring(i-1);
                System.out.println(a);
                int num=Integer.valueOf(a);
                System.out.println(num);
                 if(num<26){
                    count+=2;
                }
            }
            System.out.println(count);
        }
       return count;
        
    }
}
