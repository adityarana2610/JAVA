class recur7
{
    int Recur(int m)
    {
        int i,k=0;
        if(m%2==0)
        {
            i=m/2;
            k=1;
        }
        else
        {
            k=m;
            m--;
            i=m/2;
        }
        while(i>0)
        {
            k=k*i*m;
            i--;
            m--;
        }
        return k;
    }
}