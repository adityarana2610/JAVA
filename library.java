import java.util.*;
class library
{
    Scanner sc=new Scanner(System.in);
    String title;
    String author;
    int price;
    library(String t,String a,int p)
    {
        title=t;
        author=a;
        price=p;
    }
    void show()
    {
        System.out.println("Name of the book= "+title);
        System.out.println("Author of the book= "+author);
        System.out.println("Price of the book= "+price);
    }
}
class compute extends library
{
    Scanner sc=new Scanner(System.in);
    int d;
    int f;
    compute(String t,String a,int p,int dd)
    {
        super(t,a,p);
        d=dd;
    }
    void fine()
    {
        if(d>7)
        d=d-7;
        if(d>=1 && d<=5)
        f=d*2;
        else if(d>5 && d<=10)
        f=5*2+(d-5)*3;
        else if(d>10)
        f=5*2+5*3+(d-10)*5;
    }
    void display()
    {
        super.show();
        double amt=.02*price*d+f;
        System.out.println("Total amount= "+amt);
    }
}