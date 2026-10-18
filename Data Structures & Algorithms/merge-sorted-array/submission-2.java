class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tmp = 0;
        for(int i = 0; i < m + n; i++){
            if(nums1[i] == 0 && tmp < n){
                nums1[i] = nums2[tmp];
                tmp++;
            }
        }
        Arrays.sort(nums1);
    }
}