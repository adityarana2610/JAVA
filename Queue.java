import java.util.*;
class Queue
{
    Scanner sc=new Scanner(System.in);
    int Que[];int size;int front;int rear;
    Queue(int mm)
    {
        size=mm;
        front=0;
        rear=0;
        Que=new int[size];
    }
    void addele(int v)
    {
        if(rear==size-1)
        {
            System.out.println("Overflow");
        }
        else if(rear==0)
        {
            front=rear=1;
            Que[rear]=v;
        }
        else
        {
            Que[++rear]=v;
        }
    }
    int delele()
    {
        int m;
        if(rear==0)
        {
            m=-9999;
        }
        else if(front==rear)
        {
            m=Que[front];
            front=rear=0;
        }
        else
        {
            m=Que[front++];
        }
        return m;
    }
    void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(Que[i]+" ");
        }
    }
}