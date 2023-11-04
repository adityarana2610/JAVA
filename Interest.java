import java.util.*;
class Interest extends Bank
{
    Scanner sc=new Scanner(System.in);
    double rate;
    double time;
    Interest(String N,int A,double P,double r,double t)
    {
        super(N,A,P);
        rate=0.0;
        time=0.0;
    }
    double calculate()
    {
        return principal*Math.pow((1+rate/100),time)-principal;
    }
    void display()
    {
        super.display();
        System.out.println("Rate= "+rate);
        System.out.println("Time= "+time);
        double c=calculate();
        System.out.println("Compound Interest= "+c);
    }
}