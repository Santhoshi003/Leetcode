class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            String s1 = strs[i];
            int j = 0;
            for(; j < Math.min(prefix.length(),s1.length()); j ++) {
                if(prefix.charAt(j) != s1.charAt(j)) {
                    break;
                }
            }
            prefix = prefix.substring(0,j);
            } 
        return prefix;
    }
    }