class Solution {
    public int maxDepth(String s) {
        
        int ans=0;
        int depth=0;

        for(char c: s.toCharArray()) {
            if(c== '(') ans= Math.max(ans, ++depth);
            if(c==')') depth--;
        }

        return ans;
    }
}