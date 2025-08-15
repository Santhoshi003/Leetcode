class Solution {
public:
    bool isPowerOfFour(int n) {
         int i=0,c=4;
        while(n>=pow(c,i)){
            if(n==pow(c,i))     return true;
            else                     i++;
        }
        return false;
    }
};