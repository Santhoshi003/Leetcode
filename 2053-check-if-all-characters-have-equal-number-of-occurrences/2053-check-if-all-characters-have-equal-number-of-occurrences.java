class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean same=allFrequenciesSame(map);
        return same;
    }
    static boolean allFrequenciesSame(HashMap<?,Integer> map)
    {
        if(map.isEmpty()) return false;
        int first=-1;
        for(int freq : map.values())
        {
            if(first==-1)  first=freq;
            else if(freq!=first) return false;
        }
        return true;
    }
}