public class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int res = 0;
        int right = heights.length - 1;
        while(left <= right){
            int area = Math.min(heights[left], heights[right]) * (right - left);
            if(heights[left] < heights[right]){
                left++;
            } else{
                right--;
            }
            res = Math.max(area, res);
        }
        return res;
    }
}