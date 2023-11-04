import java.util.*;
class Link
{
    Scanner sc=new Scanner(System.in);
    int lnk[];int max;
    int begin;int end;
    Link(int mm)
    {
        max=mm;
        begin=0;
        end=0;
    }
    void addlink(int v)
    {
        if(end<=max-1)
        {
            lnk[++end]=v;
        }
        else 
        {
            System.out.println("OUT OF SIZE...");
        }
    }
    int dellink()
    {
        int x;
        if(begin!=end)
        {
            x=lnk[++begin];
            return x;
        }
        else
        {
            System.out.println("EMPTY...");
            return -99;
        }
    }
    void display()
    {
        System.out.println("Elements are= ");
        for(int i=begin+1;i<=end;i++)
        {
            System.out.print(lnk[i]+" ");
        }
    }
}