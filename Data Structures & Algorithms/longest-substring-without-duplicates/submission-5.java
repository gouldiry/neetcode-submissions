class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int res = 0;
        Set<Character> newSet = new HashSet<>();
        for(int r = 0; r < s.length(); r++){
            while(newSet.contains(s.charAt(r))){
                newSet.remove(s.charAt(l));
                l++;
            }
            newSet.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}