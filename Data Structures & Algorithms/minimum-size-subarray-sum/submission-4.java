class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int res = Integer.MAX_VALUE;
        int totalSum = 0;
        for(int right = 0; right < nums.length; right++){
            totalSum += nums[right];
            while(totalSum >= target){
                res = Math.min(res, right - left + 1);
                totalSum -= nums[left];
                left++;
            }
        }
        if(res == Integer.MAX_VALUE) return 0;
        return res;
    }
}