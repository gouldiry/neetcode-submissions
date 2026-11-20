class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> newSet = new HashSet<>();
        int count = 0;
        int res = 0;
        for(int num : nums){
            newSet.add(num);
        }
        for(int i = 0; i < nums.length; i++){
            if(!newSet.contains(nums[i] - 1)){
                count = 1;
                while(newSet.contains(nums[i] + count)){
                    count++;
                }
                res = Math.max(count, res);
            }
        }
        return res;
    }
}