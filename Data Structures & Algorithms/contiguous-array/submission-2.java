public class Solution {
    public int findMaxLength(int[] nums) {
        int zero = 0, one = 0, res = 0;
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else {
                one++;
            }
            int diff = one - zero;
            if (!newMap.containsKey(diff)) {
                newMap.put(diff, i);
            }
            if (one == zero) {
                res = one + zero;
            } else {
                res = Math.max(res, i - newMap.get(diff));
            }
        }
        return res;
    }
}