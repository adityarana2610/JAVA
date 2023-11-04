import java.util.*;
class ArrayToStack
{
    Scanner sc=new Scanner(System.in);
    int m[];int st[];
    int cap;int top;
    ArrayToStack(int n)
    {
        cap=n;
        top=-1;
        m=new int[cap];
        st=new int[cap];
    }
    void input_marks()
    {
        System.out.println("Enter Marks: ");
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
        System.out.println("Stack Elements are: ");
        for(int i=0;i>0;i++)
        {
            System.out.print(st[i]);
        }
    }
}