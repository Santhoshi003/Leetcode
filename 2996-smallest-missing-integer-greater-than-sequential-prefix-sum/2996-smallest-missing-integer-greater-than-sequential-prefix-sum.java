class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int [] arr = new int[n];
        int sum = nums[0];
        int mini = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            if(nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            }
            else {
                break;
            }
        }
        HashSet<Integer> s1 = new HashSet<>();
        for(int x : nums) {
            s1.add(x);
        }
        while(s1.contains(sum)) {
            sum++;
        }
        return sum;
    }
}