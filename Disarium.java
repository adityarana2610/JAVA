import java.util.*;
class Disarium
{
    Scanner sc=new Scanner(System.in);
    int num;
    int size;
    Disarium(int nn)
    {
        num=nn;
        size=0;
    }
    void countDigit()
    {
        int a=num;
        while(a!=0)
        {
            a=a/10;
            size=size+1;
        }
    }
    int sumofDigits(int n,int p)
    {
        int sum=0;
        if(n==0)
        {
            return 0;
        }
        else
        {
            sum=sum+sumofDigits(n/10,p-1)+(int)Math.pow(n%10,p); 
        }
        return sum;
    }
    void check()
    {
        if(num==sumofDigits(num,size))
        {
            System.out.println("DISARIUM NUMBER");
        }
        else
        {
            System.out.println("NOT A DISARIUM NUMBER");
        }
    }
    public static void main()
    {
        Disarium ob=new Disarium(135);
        ob.countDigit();
        ob.check();
    }
}