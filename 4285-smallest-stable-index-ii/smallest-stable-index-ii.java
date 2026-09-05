class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int l= nums.length;
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        int[] b= new int[l];

        for(int i=l-1; i>=0; i--) {
            min= Math.min(min, nums[i]);
            b[i]= min;
        }

        for(int i=0; i<l; i++) {
            max= Math.max(max, nums[i]);

            if(max-b[i]<=k) return i;
        }

        return -1;
    }
}