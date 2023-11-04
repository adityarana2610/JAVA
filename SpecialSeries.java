import java.util.*;
public class SpecialSeries
{
    Scanner sc=new Scanner(System.in);
    int no;
    double S;
    SpecialSeries()
    {
        int no=0;
        double S=0.0;
    }
    public void accept()
    {
        System.out.println("Enter Value");
        no=sc.nextInt();
    }
    int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
            
        }
        return f;
    }
    int power(int n)
    {
        int pow=0;
        pow=(int)Math.pow(n,n);
        return pow;
    }
    void display()
    {
        int S1=0;
        int S2=0;
        for(int i=1;i<=no;i=i+2)
        {
            S1=S1+fact(i);
        
            }
        for(int i=2;i<=no;i=i+2)
        {
            S2=S2+power(i);
        }
        S=S1+S2;
        System.out.println("Sum of the series=" +S2);
        }
    public static void main(String args[])
        {
            SpecialSeries ob=new SpecialSeries();
            ob.accept();
            //ob.fact();
            //ob.power();
            ob.display();
        }
    }

