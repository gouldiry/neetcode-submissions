class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> newSet = new HashSet<>();
        for(int num : nums){
            newSet.add(num);
        }
        int res = 0;
        for(int num : nums){
            int count = 1;
            if(!newSet.contains(num - 1)){
                while(newSet.contains(num + count)){
                    count++;
                }
            }
            res = Math.max(res, count);
        }
        return res;
    }
}