class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] frq=new int[10];
        while(n>0) {
                int digit=n%10;
                frq[digit]++;
                n=n/10;
            }
        int minfrq=Integer.MAX_VALUE;
        int result=-1;
        for(int d=0;d<=9;d++)
            {
                if(frq[d]>0)
                {
                     if(frq[d]<minfrq || (frq[d]==minfrq && d<result))
                     {
                         minfrq=frq[d];
                         result=d;
                     }
                }
            }
        return result;
    }
}