import java.util.*;
class CirQueue1
{
    Scanner sc=new Scanner(System.in);
    int cq[];
    int cap;int front;int rear;
    CirQueue1(int max)
    {
        cap=max;
        front=0;rear=0;
        cq=new int[cap];
    }
    void push(int n)
    {
        if((front==1 && rear==cap-1)||(front==rear+1))
        {
            System.out.println("QUEUE IS FULL");
            return;
        }
        else
        {
            if(rear==0)
            {
                front=rear=1;
            }
            else if(rear==cap-1)
            {
                rear=1;
            }
            else
            {
                rear=rear+1;
            }
            cq[rear]=n;
        }
    }
    int pop()
    {
        int a=cq[front];
        if(front==0)
        {
            return -9999;
        }
        else
        {
            if(front==rear)
            {
                front=0;
                rear=0;
            }
            else if(front==cap-1)
            {
                front=1;
            }
            else
            {
                front=front+1;
            }
        }
        return a;
    }
}