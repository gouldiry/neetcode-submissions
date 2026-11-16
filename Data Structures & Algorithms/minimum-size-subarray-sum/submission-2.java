class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int total = 0;
        int res = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            total += nums[right];
            while(total>= target){
                res = Math.min(res, right - left + 1);
                total -= nums[left];
                left++;
            }
        }
        if(res == Integer.MAX_VALUE){
            return 0;
        }
        return res;
    }
}