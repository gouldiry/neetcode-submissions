class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        for(int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        
        return sb.toString().equals(s);
    }
}