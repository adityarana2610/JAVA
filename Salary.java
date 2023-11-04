import java.util.*;
class Salary extends Employee
{
    float basic;
    Salary(float b,int n,String name,String d)
    {
        super(n,name,d);
        basic=b;
    }
    void calculate()
    {
        double da=0.1*basic;
        double hra=0.15*basic;
        double s=basic+da+hra;
        double pf=0.08*s;
        double net=s-pf;
        super.display();
        System.out.println("Net Salary: "+net);
    }
    public static void main()
    {
        Salary ob=new Salary(20000,1,"a","b");
        ob.calculate();
    }
}
