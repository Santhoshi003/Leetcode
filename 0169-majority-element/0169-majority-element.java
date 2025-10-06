class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int c=nums.length/2;
        int key1=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>c) 
             key1= entry.getKey();
        }
        return key1;
    }
}