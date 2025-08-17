class Solution {
public:
    int num(int n,int k){
        while(n%k==0)
        n=n/k;
        return n;
    }
    bool isUgly(int n) {
      if(n==1) return true;
      if(n<=0) return false;
        n=num(n,2);
        n=num(n,3);
        n=num(n,5);
        if(n==1) return true;
        else return false;
    }
};