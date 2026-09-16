class Solution {
    public String longestPalindrome(String s) {
        
        String ans="";

        for(int i=0;i<s.length();i++){
            String o= expand(s,i,i);
            String e= expand(s,i,i+1);

            if(o.length()>ans.length()) ans=o;
            if (e.length()>ans.length()) ans=e;
        }

        return ans;
    }

    public String expand(String s, int l, int r){

        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }

        return s.substring(l+1,r);
    }
}