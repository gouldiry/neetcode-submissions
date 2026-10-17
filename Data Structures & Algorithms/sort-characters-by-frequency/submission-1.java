public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        List<List<Character>> buckets = new ArrayList<>(s.length() + 1);
        for (int i = 0; i <= s.length(); i++) {
            buckets.add(new ArrayList<>());
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            buckets.get(entry.getValue()).add(entry.getKey());
        }

        StringBuilder res = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            for (char c : buckets.get(i)) {
                for (int j = 0; j < i; j++) {
                    res.append(c);
                }
            }
        }

        return res.toString();
    }
}