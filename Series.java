import java.util.*;
class Series
{
    Scanner sc=new Scanner(System.in);
    int x;
    int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    int power(int a,int b)
    {
        double p=Math.pow(a,b);
        return(int)p;
    }
    void read()
    {
        System.out.println("Enter the value of x= ");
        x=sc.nextInt();
    }
    void main()
    {
        Series ob=new Series();
        ob.read();
        double sum=0;
        for(int i=1;i<=6;i++)
        {
            //System.out.println("Power= "+ob.power(x,i));
            //System.out.println("fact= "+ob.fact(i));
            sum=sum+(ob.power(x,i)/ob.fact(i));
        }
        System.out.println("Sum of the Series= "+sum);
    }
}