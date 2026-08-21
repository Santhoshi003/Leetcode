class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map1 = new HashMap<>();
        for(int x: nums) {
            map1.put(x,map1.getOrDefault(x,0)+1);
        }
        int n = nums.length/3;
        List<Integer>ls = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry : map1.entrySet()) {
            if(entry.getValue()>n)
            {
                ls.add(entry.getKey());
            }
        }
        return ls;
    }
}