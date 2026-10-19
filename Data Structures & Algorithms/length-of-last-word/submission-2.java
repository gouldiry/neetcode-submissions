class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim();
        int res = 0;
        int l = s.length() - 1;
        while(l >= 0 && s.charAt(l) != ' '){
            res++;
            l--;
        }
        return res;
    }
}