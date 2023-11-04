import java.util.*;
class Array_to_Stack
{
    Scanner sc=new Scanner(System.in);
    int m[];int st[];
    int cap;int top;
    Array_to_Stack(int n)
    {
        cap=n;
        top=-1;
        m=new int[cap];
        st=new int[cap];
    }
    void input_marks()
    {
        System.out.println("Enter Marks in Ascending Order= ");
        for(int i=0;i<cap;i++)
        {
            m[i]=sc.nextInt();
            pushmarks(m[i]);
        }
    }
    void pushmarks(int v)
    {
        if(top<=cap-1)
        {
            st[++top]=v;
        }
        else
        {
            System.out.println("not possible");
        }
    }
    int popmarks()
    {
        if(top>=0)
        {
            return top--;
        }
        else
        {
            return -999;
        }
    }
    void display()
    {
        for(int i=0;i>0;i++)
        {
            System.out.println(st[i]);
        }
    }
}