class Solution {
    public String largestOddNumber(String num) {
        String res= "";
        int indx = -1;
        for(int i = num.length() - 1; i >= 0; i--) {
            int x = num.charAt(i) - '0';
            if(x % 2 != 0) {
                indx = i;
                break;
            }
        }
        if(indx == -1) {
            return "";
        }
        for(int i = 0; i <= indx; i++) {
            res += num.charAt(i);
        }
        return res;
    }
}