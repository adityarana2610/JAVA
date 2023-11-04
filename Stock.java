import java.util.*;
class Stock
{
    Scanner sc=new Scanner(System.in);
    String item;int qty;int rate;int amt;
    Stock(String i,int q,int r)
    {
        item=i;
        qty=q;
        rate=r;
        amt=qty*rate;
    }
    void display()
    {
        System.out.println("Name of item= "+item);
        System.out.println("Quantity of item= "+qty);
        System.out.println("Rate of item= "+rate);
        System.out.println("Net Value of item= "+amt);
    }
}
class Purchase extends Stock
{
    Scanner sc=new Scanner(System.in);
    int pqty;int prate;
    Purchase(String i,int q,int r,int pq,int pr)
    {
        super(i,q,r);
        pqty=pq;
        prate=pr;
    }
    void update()
    {
        qty=qty+prate;
        if(prate!=rate)
        {
            rate=prate;
        }
        amt=qty*rate;
    }
    void display()
    {
        super.display();
        update();
        super.display();
    }
}