import java.util.*;
class SeriesSum
{
    int x;
    int n;
    double sum;
    SeriesSum(int xx,int nn)
    {
        x=xx;
        n=nn;
        sum=0.0;
    }
    double findfact(int m)
    {
        if(m!=1)
        {
            return m*findfact(m-1);
        }
        else
        {
            return 1;
        }
    }
    double findpower(int x,int y)
    {
        if(y!=0)
        {
            return x*findpower(x,y-1);
        }
        else
        {
            return 1;
        }
    }
    void calculate()
    {
        for(int i=2;i<=n;i=i+2)
        {
            sum=sum+findpower(x,i)/findfact(i-1);
        }
    }
    void display()
    {
        System.out.println("Sum: "+sum);
    }
    public static void main()
    {
        SeriesSum ob=new SeriesSum(3,8);
        ob.calculate();
        ob.display();
    }
}