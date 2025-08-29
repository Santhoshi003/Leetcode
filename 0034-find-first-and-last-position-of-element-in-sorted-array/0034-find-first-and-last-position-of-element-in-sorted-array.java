class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] res ={-1,-1};
        int index=Arrays.binarySearch(nums,target);
        if(index<0 )
        {
            return res;
        }
        int left=index;
        int right = index;
        while(left-1>=0 && nums[left-1]==target)
        {
            left--;
        }
        while(right+1<nums.length && nums[right+1]==target)
        {
            right++;
        }
        res[0]=left;
        res[1]=right;
        return res;
    }
}