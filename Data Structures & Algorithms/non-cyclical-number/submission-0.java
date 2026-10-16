class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(!seen.contains(n)){
            seen.add(n);
            n = squareOfDigits(n);
            if(n == 1){
                return true;
            }
        }
        return false;
    }
    private int squareOfDigits(int n){
        int output = 0;
        while(n > 0){
            int digit = n % 10;
            output += digit * digit;
            n /= 10;
        }
        return output;
    }
}
