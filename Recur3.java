class Recur3
{
    void comp(int a,int b)
    {
        int an,s,k;
        if(a<b)
        {
            s=a;
            k=b;
        }
        else
        {
            s=b;
            k=a;
        }
        an=k;
        while(an%s!=0)
        an+=k;
        System.out.println("Answer= "+an);
    }
}