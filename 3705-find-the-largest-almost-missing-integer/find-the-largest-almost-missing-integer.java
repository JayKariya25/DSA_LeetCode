class Solution {
    public int largestInteger(int[] n, int k) {
        int[] a= new int[51];
        for(int i:n) a[i]++;

        int res=-1, l=n.length;
        for(int i=0; i<l; i++) {
            if(k==l || (a[n[i]]==1 && (k==1 || i==0 || i==l-1))) res= Math.max(res,n[i]);
        }

        return res;
    }
}