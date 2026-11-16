
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int res = 0;
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            count.put(nums[right], count.getOrDefault(nums[right], 0) + 1);

            while (count.get(nums[right]) > k) {
                count.put(nums[left], count.get(nums[left]) - 1);
                left++;
            }

            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
