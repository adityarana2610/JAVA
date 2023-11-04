class Recur4
{
    int Find(int a,int b)
    {
        if(b==1)
        return -a;
        else
        return ++a+ Find(a,--b);
    }
}