public class Solution {
    public String frequencySort(String str) {
    if (str == null || str.isEmpty()) return str;
    
    Map<Character, Integer> frequencyMap = new HashMap<>();
    for (char ch : str.toCharArray()) {
        frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
    }
    
    int maxFreq = Collections.max(frequencyMap.values());
    
    List<List<Character>> buckets = new ArrayList<>();
    for (int i = 0; i <= maxFreq; i++) {
        buckets.add(new ArrayList<>());
    }
    for (Character key : frequencyMap.keySet()) {
        int frequency = frequencyMap.get(key);
        buckets.get(frequency).add(key);
    }
    
    StringBuilder result = new StringBuilder();
    for (int i = buckets.size() - 1; i >= 1; i--) {
        for (Character c : buckets.get(i)) {
            for (int j = 0; j < i; j++) {
                result.append(c);
            }
        }
    }
    return result.toString();
}
}