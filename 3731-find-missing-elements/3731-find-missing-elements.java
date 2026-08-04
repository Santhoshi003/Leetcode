class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < mini) {
                mini = nums[i];
            }
            if(nums[i] > maxi) {
                maxi = nums[i];
            }
        }
        List<Integer> l1 = new ArrayList<>();
        HashSet<Integer> s1 = new HashSet<>();
        for(int x : nums) {
            s1.add(x);
        }
        for(int j = mini; j <= maxi; j++) {
            if(!s1.contains(j)) {
                l1.add(j);
            }
        }
        return l1;
    }
}