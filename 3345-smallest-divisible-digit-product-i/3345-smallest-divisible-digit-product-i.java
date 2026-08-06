class Solution {
    public int product1(int num) {
        int pr = 1;
        while(num != 0) {
                int re = num % 10;
                pr = re * pr;
                num = num / 10;
            }
            return pr;
    }
    public int smallestNumber(int n, int t) {
        int res = Integer.MAX_VALUE;
        for(int num = n; num <= n + 10; num++) {
            int pr = product1(num);
            if(pr % t == 0) {
               res = Math.min(num,res);
            }
        }
        return res;
    }
}