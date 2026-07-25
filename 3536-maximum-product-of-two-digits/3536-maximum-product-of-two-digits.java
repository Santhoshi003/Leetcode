class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        int[] arr = new int[len];
        int j = 0;
        while(n!=0) {
            int re = n % 10;
            arr[j] = re;
            n = n / 10;
            j++;
        }
        int maxi = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int k = i + 1; k < arr.length; k++) {
                maxi = Math.max(maxi, arr[i] * arr[k]);
            }
        }
        return maxi;
    }
}