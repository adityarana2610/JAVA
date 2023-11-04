import java.util.*;
class Dequeue
{
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[10];
    int lim;int front;int rear;
    Dequeue(int l)
    {
        lim=l;
        front=rear=0;
        arr=new int[lim];
    }
    void addfront(int val)
    {
        if(front>0)
        {
            arr[front--]=val;
        }
        else
        {
            System.out.println("Overflow from front");
        }
    }
    void addrear(int val)
    {
        if(rear<lim-1)
        {
            arr[++rear]=val;
        }
        else
        {
            System.out.println("Overflow from rear");
        }
    }
    int popfront()
    {
        if(front!=rear)
        {
            return arr[++front];
        }
        else
        {
            return -9999;
        }
    }
    int poprear()
    {
        if(front!=rear)
        {
            return arr[rear--];
        }
        else
        {
            return -9999;
        }
    }
}