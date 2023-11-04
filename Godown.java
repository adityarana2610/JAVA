import java.util.*;
class Godown
{
    Scanner sc=new Scanner(System.in);
    String item;
    int qty;
    int rate;
    int amt;
    Godown(String i,int q,int r,int a)
    {
        item=i;
        qty=q;
        rate=r;
        amt=a;
    }
    void display()
    {
        System.out.println("Name of item= "+item);
        System.out.println("Quantity of item= "+qty);
        System.out.println("Unit Price= "+rate);
        System.out.println("Net Value= "+amt);
    }
}