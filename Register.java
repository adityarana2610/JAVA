import java.util.*;
class Register
{
    Scanner sc=new Scanner(System.in);
    String stud[];
    int cap;
    int top;
    Register(int max)
    {
        cap=max;
        top=-1;
        stud=new String[cap];
    }
    void push(String n)
    {
        if(cap>top+1)
        {
            stud[++top]=n;
        }
        else
        {
            System.out.println("OVERFLOW");
        }
        
    }
    String pop()
    {
        if(top==-1)
        {
            return "$$";
        }
        else
        {
            return stud[top--];
        }
    }
    void display()
    {
        System.out.println("Names are: ");
        for(int i=0;i<=top;i++)
        {
            System.out.println(stud[i]);
        }
    }
}