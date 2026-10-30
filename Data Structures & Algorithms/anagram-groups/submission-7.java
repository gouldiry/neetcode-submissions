class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> nMap = new HashMap<>();
       for(String str : strs){
           int[] count = new int[26];
           for(char c : str.toCharArray()){
               count[c - 'a']++;
           }
           String key = Arrays.toString(count);
           nMap.putIfAbsent(key, new ArrayList<>());
           nMap.get(key).add(str);
       }
       return new ArrayList<>(nMap.values());
    }
}