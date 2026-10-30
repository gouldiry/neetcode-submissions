public class Solution {
    public int subarraySum(int[] nums, int k) {
       int res = 0;
       int currSum = 0;
       Map<Integer, Integer> nMap = new HashMap<>();
       nMap.put(0,1);
       for(int num : nums){
           currSum += num;
           int diff = currSum - k;
           res += nMap.getOrDefault(diff, 0);
           nMap.put(currSum, nMap.getOrDefault(currSum, 0) + 1);
       }
       return res;
    }
}