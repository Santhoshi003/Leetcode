class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        String result = s.concat(s);
        return result.contains(goal);
    }
}