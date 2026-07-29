class Solution {
    public int maxProduct(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        int pr = 1;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                pr = ((nums[i] - 1) * (nums[j] - 1));
                maxi = Math.max(maxi,pr);
            }
        }
        return maxi;
    }
}