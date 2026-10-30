class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       Map<Integer, Integer> nMap = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
           if(nMap.containsKey(nums[i]) && i - nMap.get(nums[i]) <= k){
            return true;
           }
           nMap.put(nums[i], i);
       }
        return false;
    }
}