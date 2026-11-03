class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> newSet = new HashSet<>();
        int left = 0;
        int res = 0;
        for(int r = 0; r < s.length(); r++){
            while(newSet.contains(s.charAt(r))){
                newSet.remove(s.charAt(left));
                left++;
            }
            newSet.add(s.charAt(r));
            res = Math.max(res, r - left + 1);
        }
        return res;
    }
}