class Solution {
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > maxi) {
                maxi = nums[i];
            }
            if(nums[i] < mini) {
                mini = nums[i];
            }
        }
        int result = gcd(maxi,mini);
        return result;
    }
}