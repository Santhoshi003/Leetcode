class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> sq(candies.size(),false);
        int q=*std::max_element(candies.begin(),candies.end());
        for(size_t i=0;i<candies.size();i++)
        {
            if((candies[i]+extraCandies)>=q) sq[i]=true;
        }
        return sq;
    }
};