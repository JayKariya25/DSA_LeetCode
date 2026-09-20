class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int a, pos;

        for(int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            a = 26 - (ch - 'a');
            pos = i + 1;
            sum += a * pos;
        }

        return sum;
    }
}