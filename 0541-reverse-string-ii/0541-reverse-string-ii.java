class Solution {
    public String reverseStr(String s, int k) {
        char [] cha = s.toCharArray();
        int j = k - 1;
        int i = 0;
        for(int start = 0; start < cha.length; start += 2 * k) {
            int left = start;
            int right = Math.min(start + k - 1,cha.length - 1);
        while(left < right) {
            char temp = cha[left];
            cha[left] = cha[right];
            cha[right] = temp;
            right--;
            left++;
            }
        }
        return new String(cha);
    }
}