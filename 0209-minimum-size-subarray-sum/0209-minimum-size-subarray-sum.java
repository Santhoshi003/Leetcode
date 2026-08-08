class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int right = 0; right < n; right++) {
            sum += nums[right];
            while(sum >= target) {
                int res = right - left + 1;
                mini = Math.min(res,mini);
                sum -= nums[left];
                left++;
            }
        }
        if(mini == Integer.MAX_VALUE) return 0;
        return mini;
    }
}