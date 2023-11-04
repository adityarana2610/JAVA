import java.util.*;
class Happy
{
    int n;
    public Happy()
    {
        n=0;
    }
    void getnum(int nn)
    {
        n=nn;
    }
    int sum_sq_digits(int x)
    {
        int d;
        if(x==0)
        return 0;
        else
        {
            d=x%10;
            return(d*d+sum_sq_digits(x/10));
        }
    }
    void ishappy()
    {
        int x=n;
        while(x>9)
        x=sum_sq_digits(x);
        if(x==1)
        System.out.println(" "+n+" is a happy number");
        else
        System.out.println(" "+n+" is not a happy number");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number= ");
        int num=sc.nextInt();
        Happy ob=new Happy();
        ob.getnum(num);
        ob.ishappy();
    }
}