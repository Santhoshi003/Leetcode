class Solution {
    public String removeStars(String s) {
        Stack<Character> s1 = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*') {
                s1.pop();
            }
            else {
                s1.push(s.charAt(i));
            }
        }
        StringBuilder result = new StringBuilder();
        while(!s1.isEmpty()) {
            result.append(s1.pop());
        }
        result.reverse();
        return new String(result);
    }
}