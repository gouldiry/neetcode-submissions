class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> newMap = new HashMap<>();
        for(int num : nums){
            newMap.put(num, newMap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int num : newMap.keySet()){
            int f = newMap.get(num);
            if(buckets[f] == null) buckets[f] = new ArrayList<>();
            buckets[f].add(num);
        }
        int[] res = new int[k];
        int idx = 0;
        for(int f = buckets.length - 1; f >= 1 && idx < k; f--){
            if(buckets[f] == null) continue;
            for(int num : buckets[f]){
                if(idx < k) res[idx++] = num;
            }
        }
        return res;
    }
}