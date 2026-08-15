class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxi = Integer.MIN_VALUE;
        int zero_count = 0;
        int left = 0;
        int len;
        int n = nums.length;
        for(int right = 0; right < n; right++) {
            if(nums[right] == 0) {
                zero_count++;
            }
            while(zero_count > k) {
                if(nums[left] == 0) {
                    zero_count--;
                }
                left++;
            } 
            len = right - left + 1;
            maxi = Math.max(len,maxi);
        }
        return maxi;
    }
}