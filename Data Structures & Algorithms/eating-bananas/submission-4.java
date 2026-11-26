class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left = 1;
       int right = 0;
      
       for(int pile : piles){
        right = Math.max(right, pile);
       }
       while(left < right){
           int middle = left + (right - left) / 2;
           long time = 0;
           for(int p : piles){
               time += (p + middle - 1) / middle;
           }
           if(time <= h){
              right = middle;
           } else{
            left = middle + 1;
           }
       }
       return left;
    }
}