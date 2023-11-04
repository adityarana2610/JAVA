import java.util.*;
class Product
{
    Scanner sc=new Scanner(System.in);
    String name;
    int code;
    double amount;
    Product(String n,int c,double p)
    {
        name=n;
        code=c;
        amount=p;
    }
    void show()
    {
        System.out.println("Enter Name of Product: "+name);
        System.out.println("Product Code: "+code);
        System.out.println("Amount of Product: "+amount);
    }
}
class Sales extends Product
{
    Scanner sc=new Scanner(System.in);
    int day;
    double tax;
    double totamt;
    Sales(String n,int c,double p,int d,double t,double amt)
    {
        super(n,c,p);
        day=d;
    }
    void compute()
    {
        double fine=0.0;
        tax=(12.4/100)*amount;
        if(day>30)
        {
            fine=(2.5/100)*amount;
        }
        totamt=amount+tax+fine;
    }
    void show()
    {
        super.show();
        System.out.println("Number of Days= "+day);
        System.out.println("Tax= "+tax);
        System.out.println("Total Amount= "+totamt);
    }
}