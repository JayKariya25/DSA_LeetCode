class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        int[] rev= new int[n];

        k=k%n;
        
        if(k==0) return;

        int j=0;

        for(int i=n-k; i<n; i++) {
            rev[j]=nums[i];
            j++;
        }

        for(int i=0; i<n-k; i++) {
            rev[j]=nums[i];
            j++;
        }

        for(int i=0; i<n; i++) {
            nums[i]=rev[i];
        }

    }
}