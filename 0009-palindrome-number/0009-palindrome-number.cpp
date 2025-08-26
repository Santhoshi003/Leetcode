class Solution {
public:
    bool isPalindrome(int x) {
    long long  temp=x;
    long long r,rev=0;
    int flag=0;
    if(x<0) return false;
    while(x!=0){
        r=x%10;
        rev=(rev*10)+r;
        x=x/10;
    }
    if(rev==temp) return true;
    else return false;
    }
};