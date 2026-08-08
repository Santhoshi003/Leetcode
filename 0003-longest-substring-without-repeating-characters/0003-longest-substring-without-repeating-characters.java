class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> s1 = new HashSet<>();
        int n = s.length();
        int left = 0; 
        int len = 0;
        int maxi = 0;
        for(int right = 0; right < n; right++) {
            char c = s.charAt(right);
            while(s1.contains(c)) {
                s1.remove(s.charAt(left));
                left++;
            }
            len = right - left + 1;
            maxi = Math.max(len,maxi);
            s1.add(c);
        }
        return maxi;
    }
}