class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap <Integer, Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
           map.put(nums[i], i);
       }
       for(int i = 0; i <nums.length; i++){
        if(map.containsKey(nums[i]) && (map.get(nums[i]) != i)){
            return true;
        }
       }
        return false;
    }
}