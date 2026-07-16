class Solution {
    public int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int mx = nums[0];
        int prefixgcd []= new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            mx = Math.max(nums[i],mx);
            prefixgcd[i] = gcd(nums[i],mx);
        }
        Arrays.sort(prefixgcd);
        int i = 0;
        int j = prefixgcd.length - 1;
        long sum = 0;
        while(i < j) {
            sum += gcd(prefixgcd[i],prefixgcd[j]);
            i++;
            j--;
        }
        return sum;
    }
}