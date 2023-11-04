import java.util.*;
class Book
{
    Scanner sc=new Scanner(System.in);
    String name[];
    int point;
    int max;
    Book(int cap)
    {
        name=new String[max];
        max=cap;
        point=-1;
    }
    void tell()
    {
        if(point<0)
        {
            System.out.println("SHELF EMPTY");
        }
        else
        {
            System.out.println(name[point]);
        }
    }
    void add(String v)
    {
        if(point<max-1)
        {
            name[++point]=v;
        }
        else
        {
            System.out.println("SHELF FULL");
        }
    }
    void display()
    {
        for(int i=point;i>=0;i--)
        {
            System.out.println(name[i]);
        }
    }
}