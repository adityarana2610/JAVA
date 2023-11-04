import java.util.*;
class Holder
{
    Scanner sc=new Scanner(System.in);
    int Q[];
    int cap;int front;int rear;
    Holder(int n)
    {
        cap=n;
        Q=new int[cap];
        front=rear=0;
    }
    void addint(int v)
    {
        if(cap-1>rear)
        {
            Q[rear++]=v;
        }
        else
        {
            System.out.println("HOLDER IS FULL");
        }
    }
    int removeint()
    {
        if(front==rear)
        {
            return -999;
        }
        else
        {
            return Q[front++];
        }
    }
    void show()
    {
        for(int i=0;i<cap;i++)
        {
            System.out.print(Q[i]+" ");
        }
    }
}