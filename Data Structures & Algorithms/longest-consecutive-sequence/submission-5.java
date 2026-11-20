class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> newSet = new HashSet<>();
        int count = 0;
        int res = 0;
        for(int num : nums){
            newSet.add(num);
        }
        for(int num : newSet){
            if(!newSet.contains(num - 1)){
                count = 1;
                while(newSet.contains(num + count)){
                    count++;
                }
                res = Math.max(count, res);
            }
        }
        return res;
    }
}