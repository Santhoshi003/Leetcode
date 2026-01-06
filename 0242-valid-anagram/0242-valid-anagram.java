class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        HashMap<Character,Integer>map1=new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char c : t.toCharArray())
        {
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        return map.equals(map1);
    }
}