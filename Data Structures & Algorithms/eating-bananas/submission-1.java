class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int p : piles) {
            right = Math.max(right, p);
        }

        while (left < right) {
            int middle = left + (right - left) / 2;

            long totalTime = 0;
            for (int p : piles) {
                totalTime += (p + middle - 1) / middle;
            }

            if (totalTime <= h) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return left;
    }
}