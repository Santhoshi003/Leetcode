class Solution {
public:
    vector<string> letterCombinations(string digits) {
        if (digits.empty()) return {};

        vector<string> result;
        string combination;
        vector<string> mapping = {
            "",     "",     "abc", "def", "ghi", 
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(0, digits, combination, mapping, result);
        return result;
    }

private:
    void backtrack(int index, const string &digits, string &combination,
                   const vector<string> &mapping, vector<string> &result) {
        if (index == digits.size()) {
            result.push_back(combination);
            return;
        }

        int digit = digits[index] - '0';
        for (char letter : mapping[digit]) {
            combination.push_back(letter);
            backtrack(index + 1, digits, combination, mapping, result);
            combination.pop_back(); // backtrack
        }
    }
};