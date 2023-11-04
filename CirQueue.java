import java.util.*;
class CirQueue
{
    Scanner sc=new Scanner(System.in);
    int cq[];
    int cap;
    int front;
    int rear;
    CirQueue(int max)
    {
        cq=new int[cap];
        cap=max;
        front=0;
        rear=0;
    }

    void push(int n)
    {
        if((front==1 && rear==cap-1)||( front==rear+1))
        {
            System.out.println("QUEUE IS FULL");
        }
        else 
        {
            if(rear==0)
            {
             front=1;
             rear=1;
            }
        
        else if(rear=cap-1)
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