class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set<Integer> newSet = new HashSet<>();
      for(int i = 0; i < nums.length; i++){
        if(newSet.contains(nums[i])){
            return true;
        }
        newSet.add(nums[i]);
      }
      return false;
    }
}