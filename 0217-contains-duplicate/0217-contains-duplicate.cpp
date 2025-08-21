class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        map<int,int>frq;
        long long  i;
        for(i=0;i<nums.size();i++)
        {
            frq[nums[i]]+=1;
        }
        for (const auto &it:frq){
            if(it.second>=2)
            {
                return true;
            }
        }
        return false;
    }
};