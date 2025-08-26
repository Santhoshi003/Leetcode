int reverse(int x){
    long long int rev=0;
    while(x!=0)
    {
        rev=rev*10+x%10;
        x=x/10;
    }
    long long int i=2147483647;
    if(rev<i && rev> -i)
    {
        return rev;
    }
    else
    {
        return 0;
    }
}