class Solution {
    public int firstUniqChar(String s) {
        Map <Character, Integer> newMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            newMap.put(s.charAt(i), newMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for(int i = 0; i < s.length(); i++){
            if(newMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}