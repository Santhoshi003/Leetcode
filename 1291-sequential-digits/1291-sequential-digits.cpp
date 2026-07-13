class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        vector<int> result;
    string digits = "123456789";
    for (int length = 2; length <= 9; length++) {  
        for (int start = 0; start + length <= 9; start++) {
            string substring = digits.substr(start, length);
            int num = stoi(substring);
            if (num >= low && num <= high) {
                result.push_back(num);
            }
        }
    }
    return result;
    }
};