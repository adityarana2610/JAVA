class Recur5
{
    public int Recur(int a,int b)
    {
        if(b<1)
        {
            return 0;
        }
        System.out.println("a= "+ a+ " b= "+ b);
        return(a + Recur(a,b-1));
       }
    }
