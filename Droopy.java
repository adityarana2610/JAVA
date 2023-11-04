import java.util.*;
class Droopy
{
    Scanner sc=new Scanner(System.in);
    int n;
    Droopy()
    {
        n=0;
    }
    void getnum()
    {
        System.out.println("Enter a Number= ");
        n=sc.nextInt();
    }
    int sq_dig_sum(int x)
    {
        x=n;
        int r=0;int sum=0;
        while(x!=0)
        {
            r=x%10;
            sum=sum+(r*r);
            x=x/10;
        }
        return sum;
    }
    void isdroopy()
    {
        int y=n;
        while(y>9)
        {
            y=sq_dig_sum(y);
        }
        if(y==1)
        {
            System.out.print("DROOPY NUMBER");
        }
        else
        {
            System.out.print("NOT A DROOPY NUMBER");
        }
    }
    void main()
    {
        Droopy ob=new Droopy();
        ob.getnum();
        //System.out.println("Enter a Number= ");
        //int z=sc.nextInt();
        System.out.println(ob.sq_dig_sum(12));
        ob.isdroopy();
    }
}