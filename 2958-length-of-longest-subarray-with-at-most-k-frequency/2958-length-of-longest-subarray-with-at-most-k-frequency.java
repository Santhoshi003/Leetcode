class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        int left = 0;
        int maxi = 0;
        for(int right = 0; right < n; right++) {
            map1.put(nums[right],map1.getOrDefault(nums[right],0)+1);
            while(map1.get(nums[right]) > k) {
                map1.put(nums[left],map1.get(nums[left]) - 1);
                left++;
            }
            maxi = Math.max(maxi,(right - left) + 1);
        }
        return maxi;
    }
}