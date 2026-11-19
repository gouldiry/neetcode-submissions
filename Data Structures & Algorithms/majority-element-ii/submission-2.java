class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> newMap = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            newMap.put(nums[i], newMap.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 0; i < nums.length; i++){
            if(newMap.get(nums[i]) > nums.length/3 && !res.contains(nums[i])){
                res.add(nums[i]);
            }
        }
        return res;
    }
}