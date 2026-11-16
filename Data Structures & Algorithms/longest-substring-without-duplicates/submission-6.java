class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int res = 0;
        Set<Character> newSet = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            while(newSet.contains(s.charAt(right))){
                newSet.remove(s.charAt(left));
                left++;
            }
            newSet.add(s.charAt(right));
            res = Math.max(res, newSet.size());
        }
        return res;
    }
}