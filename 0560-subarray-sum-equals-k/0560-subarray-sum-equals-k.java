class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        map1.put(0,1);
        int sum = 0;
        int count = 0;
        for(int x : nums) {
            sum += x;
            if(map1.containsKey(sum - k)) {
                count += map1.get((sum - k));
            }
            map1.put(sum,map1.getOrDefault(sum,0)+1);
        }
        return count;
    }
}