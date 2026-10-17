class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> newMap = new HashMap<>();
        for(String str : strs){
            int[] count = new int[26];
            for(char c : str.toCharArray()){
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            newMap.putIfAbsent(key, new ArrayList<>());
            newMap.get(key).add(str);
        }
        return new ArrayList<>(newMap.values());
    }
}
