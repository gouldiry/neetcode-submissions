//NOT SOLVED MYSELF
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int res = 0;
        Map<Integer, Integer> newMap = new HashMap<>();
        for(int right = 0; right < nums.length; right++){
            newMap.put(nums[right], newMap.getOrDefault(nums[right], 0) + 1);
            while(newMap.get(nums[right]) > k){
                newMap.put(nums[left], newMap.get(nums[left]) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
