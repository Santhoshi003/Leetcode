class Solution {
    public int minimumDeletions(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int n1 = nums.length;
        int m = 0;
        int n = 0;

        if(n1 == 1) return 1;
        if(n1 == 2) return 2;

        for(int i = 0; i < n1; i++) {
            if(nums[i] > maxi) {
                maxi = nums[i];
                m = i;
            }
            if(nums[i] < mini) {
                mini = nums[i];
                n = i;
            }
        }

     
        if(m > n) {
            int temp = m;
            m = n;
            n = temp;
        }

        int f1 = n + 1;          
        int b1 = n1 - m;         

        int ff1 = m + 1;         
        int bb1 = n1 - n;       

        int sum1 = f1;
        int sum2 = b1;
        int sum3 = ff1 + bb1;

        int result = Math.min(sum1, Math.min(sum2, sum3));

        return result;
    }
}