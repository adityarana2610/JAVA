import java.util.*;
class Queue1
{
    Scanner sc=new Scanner(System.in);
    int Que[];
    int size;int front;int rear;
    Queue1(int mm)
    {
        size=mm;
        Que=new int[size];
        front=0;rear=0;
    }
    void addele(int v)
    {
        if(rear==size-1)
        {
            System.out.println("Overflow");
        }
        else  if(rear==0)
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
        int a;
        if(rear==0)
        {
            a=-9999;
        }
        else if(front==rear)
        {
            a=Que[front];
            front=rear=0;
        }
        else
        {
            a=Que[front++];
        }
        return a;
    }
    void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(Que[i]+" ");
        }
    }
}