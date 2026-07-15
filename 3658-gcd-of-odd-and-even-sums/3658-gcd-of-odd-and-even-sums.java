class Solution {
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int esum = 0, osum = 0;
        for(int i = 1; i <= n; i++) {
            esum += (2 * i);
        }
        for(int i = 1; i <= n; i++) {
            osum += (2 * i - 1);
        }
        return gcd(esum,osum);
    }
}