public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int res = right;

        while (left <= right) {
            int middle = (left + right) / 2;

            long totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / middle);
            }
            if (totalTime <= h) {
                res = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return res;
    }
}