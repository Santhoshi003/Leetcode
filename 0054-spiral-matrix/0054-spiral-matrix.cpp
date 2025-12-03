class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& m) {
        int n = m.size();
        int p = m[0].size();
        int top = 0,left = 0;
        int i;
        int right = p-1,bottom = n-1;
        vector<int>ans;
        while(top<=bottom && left<=right)
        {
            for(i = left;i <= right; i++)
            {
                ans.push_back(m[top][i]);
            }
            top++;

            for(i = top;i <= bottom; i++)
            {
                ans.push_back(m[i][right]);
            }
            right--;

            if(top<=bottom)
            {
            for(i = right;i >= left;i--)
            {
                ans.push_back(m[bottom][i]);
            }
            bottom--;
            }
            
            if(left<=right)
            {
            for(i = bottom; i>=top; i--)
            {
                ans.push_back(m[i][left]);
            }
            left++;
            }
        }
        return ans;
    }
};