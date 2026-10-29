class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> newSet = new HashSet<>();
        for(int num : nums){
            newSet.add(num);
        }
        int longest = 0;
        for(int num : nums){
            if(!newSet.contains(num - 1)){
                int count = 1;
                while(newSet.contains(num + count)){
                    count++;
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }
}
