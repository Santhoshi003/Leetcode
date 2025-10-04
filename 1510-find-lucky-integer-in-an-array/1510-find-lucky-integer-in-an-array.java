class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num: arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int lucky=-1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getKey().equals(entry.getValue()))
            {
               lucky=Math.max(lucky,entry.getKey());
            }
        }
        return lucky;
    }
}
