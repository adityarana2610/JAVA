import java.util.*;
class Bank1
{
    Scanner sc=new Scanner(System.in);
    String name;
    int accno;
    double p;
    Bank1(String n,int a,double P)
    {
        name=n;
        accno=a;
        p=P;
    }
    void display()
    {
        System.out.println("NAME OF CUSTOMER= "+name);
        System.out.println("ACCOUNT NUMBER= "+accno);
        System.out.println("PRINCIPAL AMOUNT= "+p);
    }
}
/*class Account extends Bank1
{
    Scanner sc=new Scanner(System.in);
    double amt;
    Account(String N,int A,double p1)
    {
        super(N,A,p1);
        amt=0.0;
    }
    void deposit()
    {
        System.out.println("Enter the Amount= ");
        amt=sc.nextDouble();
        p=p+amt;
    }
    void withdraw()
    {
        System.out.println("Enter amount to withdraw= ");
        amt=sc.nextDouble();
        if(amt>p)
        {
            System.out.println("INSUFFICIENT BALANCE");
        }
        else
        
        {
            p=p-amt;
            if(p<500)
            {
                p=p-(500-p)/10;
            }
        }
    }
    void display()
    {
        super.display();
    }
}*/