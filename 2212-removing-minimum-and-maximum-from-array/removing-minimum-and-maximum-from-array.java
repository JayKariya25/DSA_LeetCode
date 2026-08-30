class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        
        if(n==1) return 1;
        
        int min=0;
        int max=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        
        int bl=Math.max(min,max)+1;
        int br=n-Math.min(min,max);
        int ml=(min+1)+(n-max);
        int mr=(max+1)+(n-min);
        
        return Math.min(Math.min(bl,br),Math.min(ml,mr));
    }
}