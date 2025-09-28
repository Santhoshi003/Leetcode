class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int count : arr)
        {
            map.put(count,map.getOrDefault(count,0)+1);
        }
        Set<Integer> set=new HashSet(map.values());
        if(set.size()==map.size())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}