class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\p{Punct}", "");
        s = s.replaceAll(" ","");
        String tmp = new StringBuilder(s).reverse().toString();
        System.out.println(tmp + " " + s + " " + s.equals(tmp));
        return(s.equals(tmp));
    }
}
