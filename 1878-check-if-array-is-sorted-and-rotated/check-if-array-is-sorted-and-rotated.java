class Solution {
    public boolean check(int[] nums) {
        boolean fault= false;
        int l= nums.length;

        for(int i=0; i<l; i++) {
            if(nums[i]> nums[(i+1)%l]) {
                if(fault) return false;
                fault= true;
            }
        }

        return true;
    }
}