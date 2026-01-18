package General;

public class CountCaesarCipherPairs {
    public static void main(String[] args) {
       String[] words = {"fusion","layout"};
       System.out.println(countPairs(words));
    }
     public static long countPairs(String[] words) {
        int n=words.length;
        int m=words[0].length();
        boolean check=true;
        long count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int first=words[i].charAt(0)%'a';
                int second=words[j].charAt(0)%'a';
                int dif=Math.abs((first-second)%26);
                dif=26-dif;

                for(int k=1;k<m;k++){
                     first=words[i].charAt(k)%'a';
                     second=words[j].charAt(k)%'a';
                    int d=Math.abs((first-second)%26);
                    d=26-d;
                    if(dif==d){
                        continue;
                    }else{
                        check=!check;
                    }
                }
                if(check){
                    count++;
                }else{
                    check=true;
                }
            }
        }
        return count;
    }
}
