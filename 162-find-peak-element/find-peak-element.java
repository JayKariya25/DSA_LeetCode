class Solution {
    public int findPeakElement(int[] nums) {
        int max= Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++) {
            max= Math.max(max, nums[i]);
        }

        for(int i=0; i<nums.length; i++) {
            if(max==nums[i]) return i;
        }

        return -1;
    }
}