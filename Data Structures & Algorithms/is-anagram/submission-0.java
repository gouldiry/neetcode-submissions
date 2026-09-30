class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars2);
        s = new String(chars);
        t = new String(chars2);
        if(s.equals(t)){
            return true;
        }
        return false;
    }
}
