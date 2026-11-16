class Solution {
    public int[] searchRange(int[] nums, int target) {
       int left = binarySearch(nums, target, true);
       int right = binarySearch(nums, target, false);
       return new int[]{left, right};
    }

    private int binarySearch(int[] nums, int target, boolean leftSide){
        int left = 0;
        int right = nums.length - 1;
        int i = -1;
        while(left <= right){
            int middle = left + (right-left) / 2;
            if(nums[middle] > target){
                right = middle - 1;
            } else if(nums[middle] < target){
                left = middle + 1;
            } else {
                i = middle;
                if(leftSide){
                    right = middle - 1;
                } else{
                    left = middle + 1;
                }
            }
        }
        return i;
    }
}