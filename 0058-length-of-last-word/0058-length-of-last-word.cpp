class Solution {
public:
    int lengthOfLastWord(string s) {
    int length = s.length();
    int i = length - 1;
    while (i >= 0 && s[i] == ' ') {
        i--;
    }
    int lastWordLength = 0;
    while (i >= 0 && s[i] != ' ') {
        lastWordLength++;
        i--;
    }
    return lastWordLength;
    }
};