class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> newSet = new HashSet<>();
        for(int num : nums){
            newSet.add(num);
        }
        for(int num : nums){
            int count = 0;
            if(!newSet.contains(num - 1)){
                while(newSet.contains(num + count)){
                    count++;
                }
            }
            res = Math.max(count, res);
        }
        return res;
    }
}