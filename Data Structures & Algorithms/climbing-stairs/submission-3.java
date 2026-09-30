class Solution {
    public int climbStairs(int n) {
        if(n <= 3){
            return n;
        }  
        int lastStep = 3;
        int prevStep = 2;
        int curr = 0;
        for(int i = 3; i < n; i++){
            curr = lastStep + prevStep;
            prevStep = lastStep;
            lastStep = curr;
        }  
        return curr;
    }
}