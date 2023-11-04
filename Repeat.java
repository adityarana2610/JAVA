import java.util.*;
class Repeat
{
    Scanner sc=new Scanner(System.in);
    int st[]=new int[10];
    int cap,f,r;
    Repeat(int m)
    {
        cap=m;
        f=r=0;
        st=new int[cap];
    }
    
    void pushvalue(int v)
    {
        if((r+1)<=cap)
        {
            r=r+1;
            st[r]=v;
        }
        else
        {
            System.out.println("Overflow");
        }
    }

    int popvalue(int v)
    {
        if(r!=f)
        {
            f=f+1;
            v=st[f];
        }
        else
        {
            return -9999;
        }
        return v;
    }
    void disp()
    {
        System.out.println("Elements are: ");
        for(int i=0;i<cap;i++)
        {
            System.out.print(st[i]);
        }
    }
}
