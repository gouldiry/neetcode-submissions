class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        String reverse = "";
        for(int i = s.length()-1; i >= 0; i--){
            reverse += s.charAt(i);
        }
        if(s.equals(reverse)){
            return true;
        }
        return false;
    }
}
