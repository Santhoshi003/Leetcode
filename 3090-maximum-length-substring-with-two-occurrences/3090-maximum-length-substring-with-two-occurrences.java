class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        int left = 0;
        int max = 0;
        int n = s.length();
        int len;
        for(int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            while(map1.get(ch) > 2) {
                char ch2 = s.charAt(left);
                map1.put(ch2,map1.get(ch2) - 1);
                left++;
            }
            len = right - left + 1;
            max = Math.max(max,len);
        }
        return max;
    }
}