class Solution {
    public boolean hasDuplicate(int[] nums) {
        int i = 0;
        Arrays.sort(nums);
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
            } else{
                return true;
            }
        }
        return false;
    }
}