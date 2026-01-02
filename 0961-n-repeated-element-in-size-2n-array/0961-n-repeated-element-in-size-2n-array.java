class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int num:nums)
        {
            map1.put(num,map1.getOrDefault(num,0)+1);
        }
        int freq=nums.length/2;
        int val=0;
        for(Map.Entry<Integer,Integer> entry: map1.entrySet())
        {
            if(entry.getValue()==freq)
            {
               val=entry.getKey();
            }
        }
        return val;
    }
}