class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = Double.MAX_VALUE;
        int j = nums.length - 1;
        for(int i = 0; i < nums.length / 2; i++) {
            double avg = (nums[i] + nums[j]) / 2.0;
            min = Math.min(min, avg);
            j--;
        }
        return min;
    }
}