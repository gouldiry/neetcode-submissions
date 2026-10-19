class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        while(l < nums.length){
            if(nums[l] >= target){
                return l;
            }
            l++;
        }
        return nums.length;
    }
}