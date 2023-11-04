import java.util.*;
class Diary
{
    Scanner sc=new Scanner(System.in);
    String Q[];
    int size;
    int start;
    int end;
    Diary(int max)
    {
        size=max;
        start=0;
        end=0;
        Q=new String[size];
    }

    boolean isEmpty()
    {
        return (start==0 && end==0);
    }

    void pushadd(String n)
    {
        if(end==0)
        {
            Q[end]=n;
            start=0;
            end=1;
        }
        else if(end<Q.length)
        {
            Q[end++]=n;
        }
        else
        {
            System.out.println("NO SPACE");
        }

    }

    String popadd()
    {
        String e;
        if(isEmpty())
            return "?????";
        else
        {
            e=Q[start];
            if(start==end-1)
                start=end=0;
            else
                start++;
            return e;
        }
    }

    void show()
    {
        for(int i=start;i<end;i++)
        {
            System.out.println(Q[i]);
        }
    }
}