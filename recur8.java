class recur8
{
    int Fun(int a,int b)
    {
        if(a>=b)
        {
            a=a-b;
            return Fun(a,b);
        }
        else
        {
            return a;
        }
    }
}