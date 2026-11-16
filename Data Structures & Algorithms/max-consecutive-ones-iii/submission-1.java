public class Solution {
    public int longestOnes(int[] nums, int k) {
       int left = 0;
       int res = 0;
       for(int right = 0; right < nums.length; right++){
           if(nums[right] == 0){
            k -= 1;
           }
           while(k < 0){
            if(nums[left] == 0){
                k += 1;
            }
            left++;
           }
           res = Math.max(res, right - left + 1);
       }
       return res;
    }
}