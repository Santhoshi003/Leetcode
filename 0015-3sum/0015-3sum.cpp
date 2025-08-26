class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        sort(nums.begin(),nums.end());
        for(size_t i=0;i<nums.size();i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int lo=i+1;
            int hi=nums.size()-1;
            while(lo<hi)
            {
                int curr=nums[i]+nums[lo]+nums[hi];
                if(curr==0)
                {
                   result.push_back ({nums[i], nums[lo], nums[hi]});
                   while (lo < hi && nums[lo] == nums[lo + 1]) lo++;
                   while (lo < hi && nums[hi] == nums[hi - 1]) hi--;
                   lo++;
                   hi--;
                }
                else if(curr<0) lo++;
                else hi--;
            }
        } 
        return result;
    }
};