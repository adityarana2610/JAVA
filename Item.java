import java.util.*;
class item
{
    Scanner sc=new Scanner(System.in);
    String name;
    int code;
    double amount;
    item(String n,int c,double a)
    {
        name=n;
        code=c;
        amount=a;
    }
    void show()
    {
        System.out.println("ITEM NAME: "+name);
        System.out.println("ITEM CODE: "+code);
        System.out.println("AMOUNT: "+amount);
    }
}
class Taxable extends item
{
    Scanner sc=new Scanner(System.in);
    double tax;
    double totamt;
    Taxable(String n,int c,double a,double t,double tot)
    {
        super(n,c,a);
        t=0.0;
        totamt=0.0;
    }
    void cal_tax()
    {
        tax=(amount*10.2)/100;
        totamt
    }
}