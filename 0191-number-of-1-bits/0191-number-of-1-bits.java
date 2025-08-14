class Solution {
    public int hammingWeight(int n) {
        String k=Integer.toString(n,2);
        int size=k.length();
        int c=0;
        for(int i=0;i<size;i++)
        {
            if(k.charAt(i)=='1') c+=1;
        }
        return c;
    }
}