class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int pr = 1;
        int count = 0;
        int left = 0; 
        if(n == 1) return 0;
        for(int right = 0; right < n; right++) {
            pr = pr * nums[right];
            while(pr >= k) {
                pr /= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}