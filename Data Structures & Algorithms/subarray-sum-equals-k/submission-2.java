public class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> newMap = new HashMap<>();
        int currSum = 0;
        int diff = 0;
        int res = 0;
        newMap.put(0,1);
        for(int num : nums){
            currSum += num;
            diff = currSum - k;
            res += newMap.getOrDefault(diff, 0);
            newMap.put(currSum, newMap.getOrDefault(currSum, 0) + 1);
        }
        return res;
    }
}