class Solution {
    public boolean uniformArray(int[] n) {
        int c=0;
        int m=Integer.MAX_VALUE;
        for(int i:n){
            m= Math.min(m,i);
            if(i%2!=0) c++;
        }

        return m%2==1 || c==0;
    }
}