import java.util.*;
class Diary1
{
    Scanner sc=new Scanner(System.in);
    String Q[];
    int size;int start;int end;
    Diary1(int max)
    {
        size=max;
        start=end=0;
        Q=new String[size];
    }
    void pushadd(String n)
    {
        if(end<size-1)
        {
            Q[end]=n;
            end=end+1;
        }
        else
        {
            System.out.println("NO SPACE");
        }
    }
    String popadd()
    {
        if(start!=end)
        {
            return Q[start++];
        }
        else
        {
            return "?????";
        }
    }
}