import java.util.*;
class CalSeries
{
    Scanner sc=new Scanner(System.in);
    int x;
    int n;
    int sum;
    CalSeries()
    {
        x=n=sum=0;
    }
    void input()
    {
        System.out.println("Enter Value of X: ");
        x=sc.nextInt();
        System.out.println("Enter Value of N: ");
        n=sc.nextInt();
    }
    int power(int p,int q)
    {
        if(q==0)
        {
            return 1;
        }
        else
        {
            return p*power(p,q-1);
        }
    }
    void cal()
    {
        int s=0;
        for(int i=0;i<=n;i++)
        {
            s=s+power(x,i);
        }
        System.out.println("SUM: "+s);
    }
    void main()
    {
        CalSeries ob=new CalSeries();
        ob.input();
        ob.cal();
    }
}
