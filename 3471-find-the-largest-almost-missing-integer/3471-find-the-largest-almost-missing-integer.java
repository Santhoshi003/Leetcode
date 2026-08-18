class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int x : nums) {
            map1.put(x,map1.getOrDefault(x,0)+1);
        }
        int max1 = -1;
        for(Map.Entry<Integer,Integer> entry : map1.entrySet()) {
            if(entry.getValue() == 1) { 
                max1 = Math.max(max1,entry.getKey());
            }
        }
        int max2 = 0;
        for(int x : nums) {
            max2 = Math.max(max2,x);
        }
        int max3 = -1;
        if(map1.get(nums[0]) == 1) {
            max3 = Math.max(nums[0],max3);
        }
        if (map1.get(nums[n - 1]) == 1) {
            max3 = Math.max(max3,nums[n - 1]);
        }
        if(k == 1) return max1;
        if(k == n) return max2;
        return max3;
    }
}